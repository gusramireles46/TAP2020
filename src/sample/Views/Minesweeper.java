package sample.Views;

import javafx.event.Event;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Minesweeper extends Stage {
    Label _lblColumnas, _lblRenglones;
    TextField _txfC, _txfR;
    Button _btnGenerar;
    VBox _vbox, _vboxGDP;
    HBox _hbox;
    Scene _escena;
    GridPane _gdpCampo;
    int _col, _row, _noBombas, _bloque[][];
    ToggleButton[][] _btnCampo;
    boolean _primero, _canPlay;
    int ki, kj;

    public Minesweeper(){
        CrearGUI();
        this.setTitle("Buscaminas");
        this.setScene(_escena);
        this.setMaximized(true);
        this.show();
    }

    public void CrearGUI() {
        _lblColumnas = new Label("Columnas");
        _txfC = new TextField();
        _txfR = new TextField();
        _lblRenglones = new Label("Renglones");
        _btnGenerar = new Button("Generar");
        _vbox = new VBox();
        _vboxGDP = new VBox();
        _hbox = new HBox();

        _hbox.getChildren().addAll(_lblColumnas, _txfC, _lblRenglones, _txfR, _btnGenerar);
        _hbox.setAlignment(Pos.CENTER);
        _vbox.getChildren().addAll(_hbox, _vboxGDP);

        _escena = new Scene(_vbox, 720, 540);

        _btnGenerar.setOnAction(e -> {
            _col = Integer.parseInt(_txfC.getText());
            _row = Integer.parseInt(_txfR.getText());
            _bloque = new int[_col][_row];

            _noBombas = (int)((_col * _row) * 0.25);

            if (_gdpCampo != null){
                _vboxGDP.getChildren().remove(_gdpCampo);
            }

            _btnCampo = new ToggleButton[_col][_row];

            _gdpCampo = new GridPane();
            _gdpCampo.setPadding(new Insets(15));

            for (int i = 0; i < _col; i++) {
                for (int j = 0; j < _row; j++) {
                    _btnCampo[i][j] = new ToggleButton();
                    _btnCampo[i][j].setPrefSize(50,50);
                    _gdpCampo.add(_btnCampo[i][j], i, j);
                    _btnCampo[i][j].setOnAction(this::handle);
                    ki = i;
                    kj = j;
                }
            }

            _vboxGDP.getChildren().add(_gdpCampo);
            _gdpCampo.setAlignment(Pos.CENTER);
            _primero = false;
            _canPlay = true;
        });
    }

    public void handle(Event event) {
        int i = 0, j = 0;
        boolean _found = false;
        for(i = 0; i < _row; i++){
            for(j = 0; j < _col; j++){
                if(event.getSource() == _btnCampo[i][j]){
                    _found = true;
                    break;
                }
            }
            if(_found) break;
        }

        if(_canPlay){
            _btnCampo[i][j].setSelected(true);
            if(!_primero){
                _minar(i, j);
                _primero = true;
            }
            if(_bloque[i][j] != 9 ){
                _abrir(i,j);
                _revelar();
            } else _gameOver();
            _verificarPartidaGanada();
        } else _revelar();
    }

    private void _verificarPartidaGanada() {
        boolean _gana = true;
        for(int i = 0; i < _col; i++){
            for(int j = 0; j < _row; j++){
                if(_bloque[i][j] == 0) {
                    _gana = false;
                    break;
                }
            }
            if(!_gana)
                break;
        }

        if(_gana){
            Alert _winAlert = new Alert(Alert.AlertType.INFORMATION);
            _winAlert.setTitle("Mensaje del sistema");
            _winAlert.setHeaderText("GANASTE!!!");
            _winAlert.setContentText("Venciste al juego, te has ganado un iPhone psicológico");
            _winAlert.showAndWait();
            _canPlay = false;
        }
    }

    private void _gameOver() {
        _canPlay = false;
        for(int i = 0; i < _col; i++){
            for(int j = 0; j < _row; j++){
                if(_bloque[i][j] == 9) {
                    _btnCampo[i][j].setText("Bboom!!!");
                    _btnCampo[i][j].setSelected(true);
                }
            }
        }
        Alert _alerta = new Alert(Alert.AlertType.CONFIRMATION);
        _alerta.setTitle("Mensaje del sistema");
        _alerta.setHeaderText("Has Perdido");
        _alerta.setContentText("No recibirás tu premio >:c");
        _alerta.showAndWait();
    }

    private void _revelar() {
        for(int i = 0; i < _col; i++){
            for(int j = 0; j < _row; j++){
                if(_bloque[i][j] == 0){
                    _btnCampo[i][j].setText("-");
                    _btnCampo[i][j].setSelected(false);

                }

                if(_bloque[i][j] == -2){
                    _btnCampo[i][j].setText("-");
                    _btnCampo[i][j].setSelected(true);
                }

                if(_bloque[i][j] > 0 && _bloque[i][j] < 3){
                    _btnCampo[i][j].setText(""+_bloque[i][j]);
                    _btnCampo[i][j].setSelected(true);
                    _btnCampo[i][j].setTextFill(Color.valueOf("#00AA00"));
                }

                if(_bloque[i][j] > 3 && _bloque[i][j] < 9){
                    _btnCampo[i][j].setText(""+_bloque[i][j]);
                    _btnCampo[i][j].setSelected(true);
                    _btnCampo[i][j].setTextFill(Color.valueOf("#AA0000"));
                }

                if(!_canPlay && _bloque[i][j] == 9){
                    _btnCampo[i][j].setSelected(true);
                }
            }
        }
    }

    private void _abrir(int x, int y) {
        if(y < 0 || x < 0 || x > _row - 1 || y > _col - 1 || _bloque[y][x] != 0) {
            return;
        }

        int _minas = 0;
        for(int i = y - 1; i <= y + 1; i++){
            for(int j = x - 1; j <= x + 1; j++){
                if(!(j < 0 || i < 0 || j > _row - 1 || i > _col - 1) && _bloque[i][j] == 9) {
                    _minas++;
                }
            }
        }

        if(_minas == 0){
            _bloque[y][x] = -2;
            for(int i = y - 1; i <= y + 1; i++){
                for(int j = x - 1; j <= x + 1; j++){
                    if(!(j < 0 || i < 0 || j > _row - 1 || i > _col - 1)) {
                        if (i != y || j != x) _abrir(i, j);
                    }
                }
            }
        } else {
            _bloque[y][x] = _minas;
        }
    }

    private void _minar(int x, int y) {
        for(int k = 1; k <= _noBombas; k++){
            int i, j;
            do{
                i = (int) (Math.random() * (_col - .01));
                j = (int) (Math.random() * (_row - .01));
            }
            while(_bloque[i][j] == 9 || (i == y && j == x));
            _bloque[i][j] = 9;
        }
    }
}
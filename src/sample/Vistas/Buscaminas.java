package sample.Vistas;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Buscaminas extends Stage {
    private GridPane _gdpTablero;
    private Label _lblColums, _lblRows;
    private TextField _txfColumns, _txfRows;
    private Button _btnGenerar, _Reiniciar;
    private ToggleButton[][] _btnCampo;
    private VBox _vbox;
    private HBox _hbox;
    private String[][] contador;
    private int nr = 0;
    private int nc = 0;
    private Scene _escena;

    public Buscaminas(){
        CrearGUI();
        this.setScene(_escena);
        this.setTitle("Buscaminas");
        this.setMaximized(true);
        this.show();
    }

    private void CrearGUI() {
        //Definición de los elementos principales
        _lblRows = new Label("Reglones");
        _lblColums = new Label("Columnas");
        _txfRows = new TextField();
        _txfColumns = new TextField();
        _btnGenerar = new Button("Generar");
        _vbox = new VBox();
        _hbox = new HBox();
        _hbox.setAlignment(Pos.CENTER);

        //Construcción de la Intefaz
        _hbox.getChildren().addAll(_lblRows, _txfRows, _lblColums, _txfColumns, _btnGenerar);

        //_escena = new Scene(_gdpTablero, 720, 1280);
    }
}

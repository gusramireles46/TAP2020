package sample.Eventos;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import java.awt.event.MouseEvent;

public class EventoBuscaminas implements EventHandler {

    private GridPane _gdpTablero;
    private TextField _txfColumns, _txfRows;
    private ToggleButton[][] _btnCampo;
    private VBox _vbox;

    public EventoBuscaminas(TextField _txfR, TextField _txfC, ToggleButton[][] _arrButton, GridPane _gdpTab, VBox _vb){
        this._txfRows = _txfR;
        this._txfColumns = _txfC;
        this._btnCampo = _arrButton;
        this._gdpTablero = _gdpTab;
        this._vbox = _vb;
    }

    @Override
    public void handle(Event event) {
        int nr = Integer.parseInt(_txfRows.getText());
        int nc = Integer.parseInt(_txfColumns.getText());

        if (_btnCampo != null){
            _vbox.getChildren().remove(_gdpTablero);
        }

        _btnCampo = new ToggleButton[nr][nc];
        _gdpTablero = new GridPane();
        _gdpTablero.setPadding(new Insets(15));

        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                _btnCampo[i][j] = new ToggleButton(i+"-"+j);
                _btnCampo[i][j].setPrefSize(50, 50);
                _gdpTablero.add(_btnCampo[i][j], i, j);
            }
        }
        _vbox.getChildren().addAll(_gdpTablero);
        _gdpTablero.setAlignment(Pos.CENTER);
    }
}
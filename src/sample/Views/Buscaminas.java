package sample.Views;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import sample.Events.EventoBuscaminas;

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

        //Evento Generar
        _btnGenerar.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventoBuscaminas(_txfRows, _txfColumns, _btnCampo, _gdpTablero, _vbox));
        //Construcción de la Intefaz
        _hbox.getChildren().addAll(_lblRows, _txfRows, _lblColums, _txfColumns, _btnGenerar);
        _vbox.getChildren().addAll(_hbox);

        _escena = new Scene(_vbox, 1280, 720);
    }
}

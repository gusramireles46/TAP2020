package sample.Vistas;

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

    public Buscaminas(){
        CrearGUI();
        //this.setScene();
        this.setTitle("Buscaminas");
        this.show();
    }

    private void CrearGUI() {
    }
}

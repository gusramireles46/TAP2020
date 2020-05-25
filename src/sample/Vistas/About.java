package sample.Vistas;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class About extends Stage {
    private Scene _escena;
    private VBox _vbox;
    private HBox _hbox;
    private Label _lblTitle, _lblInfo, _lblFooter;
    private Image _imgLogo;

    public About(){
        _vbox = new VBox();

        //Definición de los Label
        _lblTitle = new Label("Tópicos Avanzados de Programación");
        _lblTitle.setId("lblTitle");
        _lblInfo = new Label("Desarrolado por Gustavo Ramírez Mireles\nNo. Control: 18031000");
        _lblInfo.setId("lblInfo");
        _lblFooter = new Label("Tecnológico Nacional de México en Celaya");
        _lblFooter.setId("lblFooter");

        //Adición del logo del ITCelaya
        Button _logo = new Button();
        ImageView _img= new ImageView("sample/Images/ITCelaya.png");
        _logo.setGraphic(_img);
        _img.setFitHeight(128);
        _img.setFitWidth(128);
        _logo.setPrefSize(128,128);
        _logo.setDefaultButton(false);
        _logo.setStyle("-fx-background-color: transparent;");

        //Construcción de la escena
        _vbox.getChildren().addAll(_lblTitle, _logo, _lblInfo, _lblFooter);
        _vbox.setAlignment(Pos.CENTER);
        _escena = new Scene(_vbox, 480, 320);
        _escena.getStylesheets().add("");

        this.setTitle("Acerca de TAP2020");
        this.setScene(_escena);
        this.centerOnScreen();
        this.show();
    }
}

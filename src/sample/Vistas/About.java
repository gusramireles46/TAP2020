package sample.Vistas;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class About extends Stage {
    private Scene _escena;
    private VBox _vbox;
    private HBox _hbox;
    private Label _lblTitle, _lblInfo, _lblFooter;
    private Image _imgLogo;
    private Button _btnSalir;
    Image ico = new Image("sample/Images/ITCelaya.png");

    public About(){

        _vbox = new VBox();
        _btnSalir = new Button("Aceptar");
        DropShadow dropShadow = new DropShadow();
        dropShadow.setRadius(5.0);
        dropShadow.setOffsetX(3.0);
        dropShadow.setOffsetY(3.0);
        dropShadow.setColor(Color.color(0, 0, 0));

        //Definición de los Label
        _lblTitle = new Label("Tópicos Avanzados de Programación");
        _lblTitle.setId("lblTitle");
        _lblTitle.setEffect(dropShadow);
        _lblInfo = new Label("\nDesarrollado por: RAMÍREZ MIRELES GUSTAVO\nNo. Control: 18031000");
        _lblInfo.setId("lblInfo");
        _lblInfo.setEffect(dropShadow);
        _lblFooter = new Label("\nTecnológico Nacional de México en Celaya\n");
        _lblFooter.setId("lblFooter");
        _lblFooter.setEffect(dropShadow);

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
        _vbox.getChildren().addAll(_lblTitle, _logo, _lblInfo, _lblFooter, _btnSalir);
        _vbox.setAlignment(Pos.CENTER);
        _vbox.setSpacing(10);
        _escena = new Scene(_vbox, 480, 350);
        _escena.getStylesheets().add("sample/Estilos/estilos_about.css");

        //Acciones de los botones
        _btnSalir.setOnAction(event -> {
            close();
        });

        this.setTitle("Acerca de TAP2020");
        this.setScene(_escena);
        this.centerOnScreen();
        this.show();
        this.getIcons().add(ico);
    }
}

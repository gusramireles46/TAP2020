package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import sample.Vistas.About;

public class Main extends Application {
    private VBox _vbox;
    private HBox _hbox;
    private MenuBar _mnbPrincipal;
    private Menu _mnCompetencia1, _mnCompetencia2, _mnCompetencia3, _mnProyecto, _mnMore;
    private MenuItem _mitPractica1, _mitPractica2, _minPractica3, _mitPractica3, _mitPractica4, _mitProyecto, _mitAbout, _mitSalida;
    private BorderPane _bdpMain;
    private Scene _escena;
    Image ico = new Image("sample/Images/icon.png");

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Se inicializan los componentes principales
        _bdpMain = new BorderPane();
        _mnbPrincipal = new MenuBar();
        _bdpMain.setTop(_mnbPrincipal);

        //Se inicializan todos los Menu
        _mnCompetencia1 = new Menu("Competencia 1");
        _mnCompetencia2 = new Menu("Competencia 2");
        _mnCompetencia3 = new Menu("Competencia 3");
        _mnProyecto = new Menu("Proyecto");
        _mnMore = new Menu("Más ▼");

        //Se crean los MenuItem
        _mitPractica1 = new MenuItem("Buscaminas");
        _mitPractica2 = new MenuItem("Taquimecanógrafo");
        _mitPractica3 = new MenuItem("CRUD Productos");
        _mitPractica4 = new MenuItem("Pista de Atletismo");
        _mitProyecto = new MenuItem("Sistema de una Taquería");
        _mitAbout = new MenuItem("Acerca de TAP2020");
        _mitSalida = new MenuItem("Salir");

        //Se agregan los MenuItem a un Menu
        _mnCompetencia1.getItems().addAll(_mitPractica1, _mitPractica2);
        _mnCompetencia2.getItems().addAll(_mitPractica3);
        _mnCompetencia3.getItems().addAll(_mitPractica4);
        _mnProyecto.getItems().addAll(_mitProyecto);
        _mnMore.getItems().addAll(_mitAbout, _mitSalida);

        //Se agregan todos los menus al MenuBar
        _mnbPrincipal.getMenus().addAll(_mnCompetencia1, _mnCompetencia2, _mnCompetencia3, _mnProyecto, _mnMore);

        //Eventos de los MenuItem
        _mitAbout.setOnAction(event -> OpcionMenu(7));
        _mitSalida.setOnAction(event -> OpcionMenu(0));

        //Se crea la escena principal que se va a mostrar
        _escena = new Scene(_bdpMain, 720, 480);

        //Adición de estilos al programa
        _escena.getStylesheets().add("sample/Estilos/estilo_main.css");

        //Visualización del programa
        primaryStage.setMaximized(true);
        primaryStage.setTitle("Tópicos Avanzados de Programación");
        primaryStage.setScene(_escena);
        primaryStage.show();
        primaryStage.getIcons().add(ico);
    }

    private void OpcionMenu(int i) {
        switch (i){
            case 0:
                   System.exit(0);
                break;
            case 7:
                new About();
            break;
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}

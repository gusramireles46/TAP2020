package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    private VBox _vbox;
    private HBox _hbox;
    private MenuBar _mnbPrincipal;
    private Menu _mnCompetencia1, _mnCompetencia2, _mnCompetencia3, _mnProyecto, _mnSalida;
    private MenuItem _mitPractica1, _mitPractica2, _minPractica3, _mitPractica3, _mitPractica4, _mitProyecto, _mitSalida;
    private BorderPane _bdpMain;
    private Scene _escena;

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Se inicializan los componentes principales
        _bdpMain = new BorderPane();
        _mnbPrincipal = new MenuBar();
        _bdpMain.setTop(_mnbPrincipal);

        //Se inicializan todos los Menu()
        _mnCompetencia1 = new Menu("Competencia 1");
        _mnCompetencia2 = new Menu("Competencia 2");
        _mnCompetencia3 = new Menu("Competencia 3");
        _mnProyecto = new Menu("Proyecto");

        //Se crean los MenuItem()
        _mitPractica1 = new MenuItem("Buscaminas");
        _mitPractica2 = new MenuItem("Taquimecanógrafo");
        _mitPractica3 = new MenuItem("CRUD Productos");
        _mitPractica4 = new MenuItem("Pista de Atletismo");
        _mitProyecto = new MenuItem("Sistema de una Taquería");

        //Se agregan los MenuItem a un Menu
        _mnCompetencia1.getItems().addAll(_mitPractica1, _mitPractica2);

        //Se agregan todos los menus al MenuBar()
        _mnbPrincipal.getMenus().addAll(_mnCompetencia1);

        //Se crea la escena principal que se va a mostrar
        _escena = new Scene(_bdpMain, 720, 480);
        primaryStage.setMaximized(true);
        primaryStage.setTitle("Tópicos Avanzados de Programación");
        primaryStage.setScene(_escena);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

package sample.Vistas;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToolBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class Taquimecanografo extends Stage {
    private Scene _escena;
    private ToolBar _tlbMenu;
    private Button _btnAbrir, _btnSalir;
    private FileChooser _flcArchivo;
    private File _flArchivo;
    private TextArea _txaTexto, _txaEscritura;
    private Button[] _btnTeclas1, _btnTeclas2, _btnTeclas3, _btnTeclas4, _btnTeclas5, _btnTeclas6;
    private VBox _vMain, _vKeyboard;
    private HBox _hTeclas1, _hTeclas2, _hTeclas3, _hTeclas4, _hTeclas5, _hTeclas6;
    private String[] _sTeclas1 = {"esc","F1","F2","F3","F4","F5","F6","F7","F8","F9","F10","F11","F12","imp pnt", "supr"};
    private String[] _sTeclas2 = {"|","1","2","3","4","5","6","7","8","9","0","'","¿","<-"};
    private String[] _sTeclas3 = {"↹","Q","W","E","R","T","Y","U","I","O","P","´","+","}"};
    private String[] _sTeclas4 = {"bloq mayus","A","S","D","F","G","H","J","K","L","Ñ","{","↲"};
    private String[] _sTeclas5 = {"⇧","Z","X","C","V","B","N","M",",",".","-","↑","⇧"};
    private String[] _sTeclas6 = {"ctrl","fn","⊞","alt","_","alt gr","<","←","↓","→"};

    public Taquimecanografo(){
        CrearGUI();
        this.setMaximized(true);
        this.setScene(_escena);
        this.setTitle("Taquimecanógrafo");
        this.show();
    }

    private void CrearGUI() {
        //Inicialización de los elementos del Taquimecanógrafo
        _vMain = new VBox();
        _vKeyboard = new VBox();
        _tlbMenu = new ToolBar();
        _btnAbrir = new Button("Abrir");
        _btnAbrir.setGraphic(new ImageView("sample/Images/_archivos.png"));
        _btnAbrir.setOnAction(event -> AbrirExplorador());
        _btnSalir = new Button("Salir");
        _btnSalir.setGraphic(new ImageView("sample/Images/salida.png"));
        _btnSalir.setOnAction(event -> { close(); });
        _txaTexto = new TextArea();
        _txaEscritura = new TextArea();
        _hTeclas1 = new HBox();
        _hTeclas2 = new HBox();
        _hTeclas3 = new HBox();
        _hTeclas4 = new HBox();
        _hTeclas5 = new HBox();
        _hTeclas6 = new HBox();
<<<<<<< HEAD
        _tlbMenu = new ToolBar();
=======
>>>>>>> ea1c9545c44b52323104931c047ee5decc11f01b

        //Creación botones teclas 1.
        _btnTeclas1 = new Button[_sTeclas1.length];
        for (int i = 0; i < _sTeclas1.length; i++) {
            _btnTeclas1[i] = new Button(_sTeclas1[i]);
            _hTeclas1.getChildren().addAll(_btnTeclas1[i]);
            _btnTeclas1[i].setPrefWidth(100);
            _btnTeclas1[i].setId("button1");
        }

<<<<<<< HEAD
        //Creación de botones teclas 2
        _btnTeclas2 = new Button[_sTeclas2.length];
        for (int i = 0; i < _sTeclas2.length; i++) {
            _btnTeclas2[i] = new Button(_sTeclas2[i]);
            _hTeclas2.getChildren().addAll(_btnTeclas2[i]);
            _btnTeclas2[i].setPrefWidth(100);
            _btnTeclas2[i].setId("button2");
        }
        _btnTeclas2[13].setPrefWidth(150);

        //Creación de botones teclas 3
        _btnTeclas3 = new Button[_sTeclas3.length];
        for (int i = 0; i < _sTeclas3.length; i++) {
            _btnTeclas3[i] = new Button(_sTeclas3[i]);
            _hTeclas3.getChildren().addAll(_btnTeclas3[i]);
            _btnTeclas3[i].setPrefWidth(100);
            _btnTeclas3[i].setId("button3");
        }
        _btnTeclas3[0].setPrefWidth(120);
        _btnTeclas3[13].setPrefWidth(110);

        //Creación de botones teclas 4
        _btnTeclas4 = new Button[_sTeclas4.length];
        for (int i = 0; i < _sTeclas4.length; i++) {
            _btnTeclas4[i] = new Button(_sTeclas4[i]);
            _hTeclas4.getChildren().addAll(_btnTeclas4[i]);
            _btnTeclas4[i].setPrefWidth(100);
            _btnTeclas4[i].setId("button4");
        }
        _btnTeclas4[0].setPrefWidth(135);
        _btnTeclas4[12].setPrefWidth(160);

        //Creación de botones teclas 5
        _btnTeclas5 = new Button[_sTeclas5.length];
        for (int i = 0; i < _sTeclas5.length; i++) {
            _btnTeclas5[i] = new Button(_sTeclas5[i]);
            _hTeclas5.getChildren().addAll(_btnTeclas5[i]);
            _btnTeclas5[i].setPrefWidth(100);
            _btnTeclas5[i].setId("button5");
        }
        _btnTeclas5[0].setPrefWidth(190);

        //Creación de botones teclas 6
        _btnTeclas6 = new Button[_sTeclas6.length];
        for (int i = 0; i < _sTeclas6.length; i++) {
            _btnTeclas6[i] = new Button(_sTeclas6[i]);
            _hTeclas6.getChildren().addAll(_btnTeclas6[i]);
            _btnTeclas6[i].setPrefWidth(100);
            _btnTeclas6[i].setId("button6");
        }
        _btnTeclas6[4].setPrefWidth(500);

        //Definición de espaciados entre teclas
        _hTeclas1.setSpacing(5);
        _hTeclas2.setSpacing(5);
        _hTeclas3.setSpacing(5);
        _hTeclas4.setSpacing(5);
        _hTeclas5.setSpacing(5);
        _hTeclas6.setSpacing(5);
        _hTeclas1.setPadding(new Insets(5));
        _hTeclas2.setPadding(new Insets(5));
        _hTeclas3.setPadding(new Insets(5));
        _hTeclas4.setPadding(new Insets(5));
        _hTeclas5.setPadding(new Insets(5));
        _hTeclas6.setPadding(new Insets(5));

        //Añadiendo elementos al ToolBar
        _tlbMenu.getItems().addAll(_btnAbrir, _btnSalir);

        //Añadiendo elementos a la interfaz
        _vKeyboard.getChildren().addAll(_hTeclas1, _hTeclas2, _hTeclas3, _hTeclas4, _hTeclas5, _hTeclas6);
        _vKeyboard.setId("teclado");
        _vKeyboard.setPadding(new Insets(10));
        _vMain.getChildren().addAll(_tlbMenu, _txaTexto, _txaEscritura, _vKeyboard);

        //Creación de la escena
        _escena = new Scene(_vMain, 1280, 650);
        _escena.getStylesheets().add("sample/Estilos/estilo_taquimecanografo.css");
    }

    private void AbrirExplorador() {
        _flcArchivo = new FileChooser();
        _flcArchivo.setTitle("Abrir archivo");
        _flArchivo = _flcArchivo.showOpenDialog(this);
=======
        _vKeyboard.getChildren().addAll(_hTeclas1);
        _vMain.getChildren().addAll(_tlbMenu, _txaTexto, _txaEscritura, _vKeyboard);

        _escena = new Scene(_vMain);
>>>>>>> ea1c9545c44b52323104931c047ee5decc11f01b
    }
}

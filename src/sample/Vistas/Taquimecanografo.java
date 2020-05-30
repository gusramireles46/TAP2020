package sample.Vistas;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class Taquimecanografo extends Stage {
    private Scene _escena;
    private ToolBar _tlbMenu;
    private Button _btnAbrir;
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
        _btnAbrir = new Button();
        _txaTexto = new TextArea();
        _txaEscritura = new TextArea();
        _hTeclas1 = new HBox();
        _hTeclas2 = new HBox();
        _hTeclas3 = new HBox();
        _hTeclas4 = new HBox();
        _hTeclas5 = new HBox();
        _hTeclas6 = new HBox();

        //Creación botones teclas 1.
        _btnTeclas1 = new Button[_sTeclas1.length];
        for (int i = 0; i < _sTeclas1.length; i++) {
            _btnTeclas1[i] = new Button(_sTeclas1[i]);
            _hTeclas1.getChildren().addAll(_btnTeclas1[i]);
            _btnTeclas1[i].setPrefWidth(100);
            _btnTeclas1[i].setId("button1");
        }

        _vKeyboard.getChildren().addAll(_hTeclas1);
        _vMain.getChildren().addAll(_tlbMenu, _txaTexto, _txaEscritura, _vKeyboard);

        _escena = new Scene(_vMain);
    }
}

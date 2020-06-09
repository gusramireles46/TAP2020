package sample.Events;

import javafx.scene.control.ToggleButton;

public class EventoBuscaminas {
    Integer c, r;
    private ToggleButton _btnCelda, _btnVecino[][];

    public void _btnCampoActionPerformed(ToggleButton _tgbCelda, int x, int y){
        this._btnCelda = _tgbCelda;
        this.c = x;
        this.r = y;
        _tgbCelda.setSelected(true);
        //System.out.println("Se presionó "+x+", "+y);
    }

    public void _verificarCeldas(){
    }
}
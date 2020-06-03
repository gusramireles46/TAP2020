package sample.Events;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class EventoTaquimecanografo implements EventHandler<KeyEvent> {

    Button[] _arrButton1;
    Button[] _arrButton2;
    Button[] _arrButton3;
    Button[] _arrButton4;
    Button[] _arrButton5;
    Button[] _arrButton6;
    Boolean _ban = true;
    int _pos1, _pos2, _pos3, _pos4, _pos5, _pos6;

    public EventoTaquimecanografo(Button[] _arreglo1, Button[] _arreglo2, Button[] _arreglo3, Button[] _arreglo4, Button[] _arreglo5, Button[] _arreglo6){
        _arrButton1 = _arreglo1;
        _arrButton2 = _arreglo2;
        _arrButton3 = _arreglo3;
        _arrButton4 = _arreglo4;
        _arrButton5 = _arreglo5;
        _arrButton6 = _arreglo6;
    }

    @Override
    public void handle(KeyEvent event) {

        if (event.getCode() == KeyCode.ESCAPE){
            _pos1 = 0;
            _arrButton1[_pos1].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton1[_pos1].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.F1) {
            _pos1 = 1;
            _arrButton1[_pos1].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton1[_pos1].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.F2) {
            _pos1 = 2;
            _arrButton1[_pos1].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton1[_pos1].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.F3) {
            _pos1 = 3;
            _arrButton1[_pos1].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton1[_pos1].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.F4) {
            _pos1 = 4;
            _arrButton1[_pos1].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton1[_pos1].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.F5) {
            _pos1 = 5;
            _arrButton1[_pos1].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton1[_pos1].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.F6) {
            _pos1 = 6;
            _arrButton1[_pos1].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton1[_pos1].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.F7) {
            _pos1 = 7;
            _arrButton1[_pos1].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton1[_pos1].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.F8) {
            _pos1 = 8;
            _arrButton1[_pos1].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton1[_pos1].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.F9) {
            _pos1 = 9;
            _arrButton1[_pos1].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton1[_pos1].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.F10) {
            _pos1 = 10;
            _arrButton1[_pos1].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton1[_pos1].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.F11) {
            _pos1 = 11;
            _arrButton1[_pos1].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton1[_pos1].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.F12) {
            _pos1 = 12;
            _arrButton1[_pos1].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton1[_pos1].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.PRINTSCREEN) {
            _pos1 = 13;
            _arrButton1[_pos1].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton1[_pos1].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.DELETE) {
            _pos1 = 14;
            _arrButton1[_pos1].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton1[_pos1].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }

        //Teclas2
        if (event.getCode() == KeyCode.BACK_SLASH) {
            _pos2 = 0;
            _arrButton2[_pos2].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton2[_pos2].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.DIGIT1) {
            _pos2 = 1;
            _arrButton2[_pos2].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton2[_pos2].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.DIGIT2) {
            _pos2 = 2;
            _arrButton2[_pos2].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton2[_pos2].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.DIGIT3) {
            _pos2 = 3;
            _arrButton2[_pos2].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton2[_pos2].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.DIGIT4) {
            _pos2 = 4;
            _arrButton2[_pos2].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton2[_pos2].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.DIGIT5) {
            _pos2 = 5;
            _arrButton2[_pos2].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton2[_pos2].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.DIGIT6) {
            _pos2 = 6;
            _arrButton2[_pos2].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton2[_pos2].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.DIGIT7) {
            _pos2 = 7;
            _arrButton2[_pos2].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton2[_pos2].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.DIGIT8) {
            _pos2 = 8;
            _arrButton2[_pos2].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton2[_pos2].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.DIGIT9) {
            _pos2 = 9;
            _arrButton2[_pos2].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton2[_pos2].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.DIGIT0) {
            _pos2 = 10;
            _arrButton2[_pos2].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton2[_pos2].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.QUOTE) {
            _pos2 = 11;
            _arrButton2[_pos2].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton2[_pos2].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.BACK_SPACE) {
            _pos2 = 13;
            _arrButton2[_pos2].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton2[_pos2].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }

        //Teclas3
        if(event.getCode() == KeyCode.TAB ) {
            _pos3 = 0;
            _arrButton3[_pos3].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton3[_pos3].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if(event.getCode() == KeyCode.Q ) {
            _pos3 = 1;
            _arrButton3[_pos3].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton3[_pos3].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.W) {
            _pos3 = 2;
            _arrButton3[_pos3].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton3[_pos3].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.E) {
            _pos3 = 3;
            _arrButton3[_pos3].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton3[_pos3].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.R) {
            _pos3 = 4;
            _arrButton3[_pos3].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton3[_pos3].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.T) {
            _pos3 = 5;
            _arrButton3[_pos3].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton3[_pos3].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.Y) {
            _pos3 = 6;
            _arrButton3[_pos3].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton3[_pos3].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.U) {
            _pos3 = 7;
            _arrButton3[_pos3].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton3[_pos3].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.I) {
            _pos3 = 8;
            _arrButton3[_pos3].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton3[_pos3].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.O) {
            _pos3 = 9;
            _arrButton3[_pos3].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton3[_pos3].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.P) {
            _pos3 = 10;
            _arrButton3[_pos3].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton3[_pos3].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.DEAD_ACUTE) {
            _pos3 = 11;
            _arrButton3[_pos3].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton3[_pos3].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.PLUS) {
            _pos3 = 12;
            _arrButton3[_pos3].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton3[_pos3].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.BRACERIGHT) {
            _pos3 = 13;
            _arrButton3[_pos3].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton3[_pos3].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }

        //Teclas4
        if (event.getCode() == KeyCode.CAPS) {
            _pos4 = 0;
            _arrButton4[_pos4].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton4[_pos4].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.A) {
            _pos4 = 1;
            _arrButton4[_pos4].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton4[_pos4].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.S) {
            _pos4 = 2;
            _arrButton4[_pos4].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton4[_pos4].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.D) {
            _pos4 = 3;
            _arrButton4[_pos4].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton4[_pos4].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.F) {
            _pos4 = 4;
            _arrButton4[_pos4].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton4[_pos4].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.G) {
            _pos4 = 5;
            _arrButton4[_pos4].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton4[_pos4].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.H) {
            _pos4 = 6;
            _arrButton4[_pos4].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton4[_pos4].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.J) {
            _pos4 = 7;
            _arrButton4[_pos4].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton4[_pos4].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.K) {
            _pos4 = 8;
            _arrButton4[_pos4].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton4[_pos4].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.L) {
            _pos4 = 9;
            _arrButton4[_pos4].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton4[_pos4].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.BRACELEFT) {
            _pos4 = 11;
            _arrButton4[_pos4].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton4[_pos4].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.ENTER) {
            _pos4 = 12;
            _arrButton4[_pos4].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton4[_pos4].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }

        //Teclas5
        if (event.getCode() == KeyCode.SHIFT) {
            _pos5 = 0;
            _arrButton5[0].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _arrButton5[12].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton5[0].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
                _arrButton5[12].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.Z) {
            _pos5 = 1;
            _arrButton5[_pos5].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton5[_pos5].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.X) {
            _pos5 = 2;
            _arrButton5[_pos5].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton5[_pos5].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.C) {
            _pos5 = 3;
            _arrButton5[_pos5].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton5[_pos5].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.V) {
            _pos5 = 4;
            _arrButton5[_pos5].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton5[_pos5].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.B) {
            _pos5 = 5;
            _arrButton5[_pos5].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton5[_pos5].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.N) {
            _pos5 = 6;
            _arrButton5[_pos5].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton5[_pos5].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.M) {
            _pos5 = 7;
            _arrButton5[_pos5].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton5[_pos5].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.COMMA) {
            _pos5 = 8;
            _arrButton5[_pos5].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton5[_pos5].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.PERIOD) {
            _pos5 = 9;
            _arrButton5[_pos5].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton5[_pos5].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.MINUS) {
            _pos5 = 10;
            _arrButton5[_pos5].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton5[_pos5].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.UP) {
            _pos5 = 11;
            _arrButton5[_pos5].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton5[_pos5].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }

        //Teclas6
        if (event.getCode() == KeyCode.CONTROL) {
            _pos6 = 0;
            _arrButton6[_pos6].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton6[_pos6].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.WINDOWS) {
            _pos6 = 2;
            _arrButton6[_pos6].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton6[_pos6].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.ALT) {
            _pos6 = 3;
            _arrButton6[_pos6].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton6[_pos6].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.SPACE) {
            _pos6 = 4;
            _arrButton6[_pos6].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton6[_pos6].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.ALT_GRAPH) {
            _pos6 = 5;
            _arrButton6[_pos6].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton6[_pos6].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.LESS) {
            _pos6 = 6;
            _arrButton6[_pos6].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton6[_pos6].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.LEFT) {
            _pos6 = 7;
            _arrButton6[_pos6].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton6[_pos6].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.DOWN) {
            _pos6 = 8;
            _arrButton6[_pos6].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton6[_pos6].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.RIGHT) {
            _pos6 = 9;
            _arrButton6[_pos6].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            _ban = !_ban;
            if (!_ban){
                _arrButton6[_pos6].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
    }
}
package sample.Eventos;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class EventoTaquimecanografo implements EventHandler<KeyEvent> {

    Button[] arBotones1;
    Button[] arBotones2;
    Button[] arBotones3;
    Button[] arBotones4;
    Button[] arBotones5;
    Button[] arBotones6;
    Boolean ban = true;
    int pos1, pos2, pos3, pos4, pos5, pos6;

    public EventoTaquimecanografo(Button[] arreglo1, Button[] arreglo2, Button[] arreglo3, Button[] arreglo4, Button[] arreglo5, Button[] arreglo6){
        arBotones1 = arreglo1;
        arBotones2 = arreglo2;
        arBotones3 = arreglo3;
        arBotones4 = arreglo4;
        arBotones5 = arreglo5;
        arBotones6 = arreglo6;
    }

    @Override
    public void handle(KeyEvent event) {

        if (event.getCode() == KeyCode.ESCAPE){
            pos1 = 0;
            arBotones1[pos1].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones1[pos1].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.F1) {
            pos1 = 1;
            arBotones1[pos1].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones1[pos1].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.F2) {
            pos1 = 2;
            arBotones1[pos1].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones1[pos1].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.F3) {
            pos1 = 3;
            arBotones1[pos1].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones1[pos1].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.F4) {
            pos1 = 4;
            arBotones1[pos1].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones1[pos1].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.F5) {
            pos1 = 5;
            arBotones1[pos1].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones1[pos1].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.F6) {
            pos1 = 6;
            arBotones1[pos1].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones1[pos1].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.F7) {
            pos1 = 7;
            arBotones1[pos1].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones1[pos1].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.F8) {
            pos1 = 8;
            arBotones1[pos1].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones1[pos1].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.F9) {
            pos1 = 9;
            arBotones1[pos1].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones1[pos1].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.F10) {
            pos1 = 10;
            arBotones1[pos1].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones1[pos1].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.F11) {
            pos1 = 11;
            arBotones1[pos1].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones1[pos1].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.F12) {
            pos1 = 12;
            arBotones1[pos1].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones1[pos1].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.PRINTSCREEN) {
            pos1 = 13;
            arBotones1[pos1].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones1[pos1].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.DELETE) {
            pos1 = 14;
            arBotones1[pos1].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones1[pos1].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }

        //Teclas2
        if (event.getCode() == KeyCode.BACK_SLASH) {
            pos2 = 0;
            arBotones2[pos2].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones2[pos2].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.DIGIT1) {
            pos2 = 1;
            arBotones2[pos2].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones2[pos2].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.DIGIT2) {
            pos2 = 2;
            arBotones2[pos2].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones2[pos2].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.DIGIT3) {
            pos2 = 3;
            arBotones2[pos2].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones2[pos2].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.DIGIT4) {
            pos2 = 4;
            arBotones2[pos2].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones2[pos2].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.DIGIT5) {
            pos2 = 5;
            arBotones2[pos2].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones2[pos2].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.DIGIT6) {
            pos2 = 6;
            arBotones2[pos2].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones2[pos2].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.DIGIT7) {
            pos2 = 7;
            arBotones2[pos2].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones2[pos2].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.DIGIT8) {
            pos2 = 8;
            arBotones2[pos2].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones2[pos2].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.DIGIT9) {
            pos2 = 9;
            arBotones2[pos2].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones2[pos2].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.DIGIT0) {
            pos2 = 10;
            arBotones2[pos2].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones2[pos2].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.QUOTE) {
            pos2 = 11;
            arBotones2[pos2].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones2[pos2].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.BACK_SPACE) {
            pos2 = 13;
            arBotones2[pos2].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones2[pos2].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }

        //Teclas3
        if(event.getCode() == KeyCode.TAB ) {
            pos3 = 0;
            arBotones3[pos3].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones3[pos3].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if(event.getCode() == KeyCode.Q ) {
            pos3 = 1;
            arBotones3[pos3].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones3[pos3].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.W) {
            pos3 = 2;
            arBotones3[pos3].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones3[pos3].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.E) {
            pos3 = 3;
            arBotones3[pos3].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones3[pos3].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.R) {
            pos3 = 4;
            arBotones3[pos3].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones3[pos3].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.T) {
            pos3 = 5;
            arBotones3[pos3].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
        }
        if (event.getCode() == KeyCode.Y) {
            pos3 = 6;
            arBotones3[pos3].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones3[pos3].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.U) {
            pos3 = 7;
            arBotones3[pos3].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones3[pos3].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.I) {
            pos3 = 8;
            arBotones3[pos3].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones3[pos3].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.O) {
            pos3 = 9;
            arBotones3[pos3].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones3[pos3].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.P) {
            pos3 = 10;
            arBotones3[pos3].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones3[pos3].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.DEAD_ACUTE) {
            pos3 = 11;
            arBotones3[pos3].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones3[pos3].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.PLUS) {
            pos3 = 12;
            arBotones3[pos3].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones3[pos3].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.BRACERIGHT) {
            pos3 = 13;
            arBotones3[pos3].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones3[pos3].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }

        //Teclas4
        if (event.getCode() == KeyCode.CAPS) {
            pos4 = 0;
            arBotones4[pos4].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones4[pos4].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.A) {
            pos4 = 1;
            arBotones4[pos4].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones4[pos4].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.S) {
            pos4 = 2;
            arBotones4[pos4].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones4[pos4].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.D) {
            pos4 = 3;
            arBotones4[pos4].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones4[pos4].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.F) {
            pos4 = 4;
            arBotones4[pos4].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones4[pos4].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.G) {
            pos4 = 5;
            arBotones4[pos4].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones4[pos4].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.H) {
            pos4 = 6;
            arBotones4[pos4].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones4[pos4].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.J) {
            pos4 = 7;
            arBotones4[pos4].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones4[pos4].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.K) {
            pos4 = 8;
            arBotones4[pos4].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones4[pos4].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.L) {
            pos4 = 9;
            arBotones4[pos4].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones4[pos4].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.BRACELEFT) {
            pos4 = 11;
            arBotones4[pos4].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones4[pos4].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.ENTER) {
            pos4 = 12;
            arBotones4[pos4].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones4[pos4].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }

        //Teclas5
        if (event.getCode() == KeyCode.SHIFT) {
            pos5 = 0;
            arBotones5[pos5].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones5[pos5].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.Z) {
            pos5 = 1;
            arBotones5[pos5].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones5[pos5].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.X) {
            pos5 = 2;
            arBotones5[pos5].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones5[pos5].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.C) {
            pos5 = 3;
            arBotones5[pos5].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones5[pos5].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.V) {
            pos5 = 4;
            arBotones5[pos5].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones5[pos5].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.B) {
            pos5 = 5;
            arBotones5[pos5].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones5[pos5].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.N) {
            pos5 = 6;
            arBotones5[pos5].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones5[pos5].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.M) {
            pos5 = 7;
            arBotones5[pos5].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones5[pos5].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.COMMA) {
            pos5 = 8;
            arBotones5[pos5].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones5[pos5].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.PERIOD) {
            pos5 = 9;
            arBotones5[pos5].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones5[pos5].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.MINUS) {
            pos5 = 10;
            arBotones5[pos5].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones5[pos5].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.UP) {
            pos5 = 11;
            arBotones5[pos5].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones5[pos5].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }

        //Teclas6
        if (event.getCode() == KeyCode.CONTROL) {
            pos6 = 0;
            arBotones6[pos6].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones6[pos6].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.WINDOWS) {
            pos6 = 2;
            arBotones6[pos6].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones6[pos6].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.ALT) {
            pos6 = 3;
            arBotones6[pos6].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones6[pos6].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.SPACE) {
            pos6 = 4;
            arBotones6[pos6].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones6[pos6].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.ALT_GRAPH) {
            pos6 = 5;
            arBotones6[pos6].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones6[pos6].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.LESS) {
            pos6 = 6;
            arBotones6[pos6].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones6[pos6].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.LEFT) {
            pos6 = 7;
            arBotones6[pos6].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones6[pos6].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.DOWN) {
            pos6 = 8;
            arBotones6[pos6].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones6[pos6].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
        if (event.getCode() == KeyCode.RIGHT) {
            pos6 = 9;
            arBotones6[pos6].setStyle("-fx-base: rgba(236, 237, 238, 1.0);");
            ban = !ban;
            if (!ban){
                arBotones6[pos6].setStyle("-fx-base: rgba(185, 185, 185, 0.5);");
            }
        }
    }
}
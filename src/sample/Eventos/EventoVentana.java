package sample.Eventos;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Optional;

public class EventoVentana implements EventHandler {
    @Override
    public void handle(Event event) {
        Alert _objAlert = new Alert(Alert.AlertType.INFORMATION);
        _objAlert.setTitle("Mensaje del sistema");
        _objAlert.setHeaderText("Está saliendo de la aplicación...");
        _objAlert.setContentText("Vuelva pronto :)");
        _objAlert.showAndWait();
    }
}

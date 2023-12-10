package francisco.eventmaster.controladores;

import francisco.eventmaster.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;

public class PantallaAdministracionController implements Initializable {

    @FXML
    private Menu closeSession;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onEventCreate(ActionEvent event) throws IOException {
        App.setRoot("PantallaCrearEvento");
    }

    @FXML
    private void onEventEdit(ActionEvent event) throws IOException {
        App.setRoot("PantallaEditarEvento");
    }

    @FXML
    private void onEventToList(ActionEvent event) throws IOException {
        App.setRoot("PantallaListarEvento");
    }

    @FXML
    private void onMailService(ActionEvent event) throws IOException {
        App.setRoot("PantallaMensajeria");
    }

    @FXML
    private void onConfirmationScreen(ActionEvent event) throws IOException {
        App.setRoot("PantallaConfirmaciones");
    }

    @FXML
    private void onLogOut(ActionEvent event) throws IOException {
        App.setRoot("PantallaInicio");
    }  
}

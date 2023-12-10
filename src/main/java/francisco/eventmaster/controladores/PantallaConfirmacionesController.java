package francisco.eventmaster.controladores;

import francisco.eventmaster.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;


public class PantallaConfirmacionesController implements Initializable {

    @FXML
    private ComboBox<String> eventTypeComboBox;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        eventTypeComboBox.getItems().addAll("Boda", "Bautizo", "Comunión", "Cumpleaños", "Concierto");
        eventTypeComboBox.getSelectionModel().selectFirst();
    }    
    
    @FXML
    private void onGoBack(ActionEvent event) throws IOException {
        App.setRoot("PantallaAdministracion");
    }

}

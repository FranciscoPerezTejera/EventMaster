package francisco.eventmaster.controladores;

import francisco.eventmaster.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class PantallaAdministracionController implements Initializable {


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onEventCreate(ActionEvent event) {
    }

    @FXML
    private void onEventEdit(ActionEvent event) {
    }

    @FXML
    private void onEventToList(ActionEvent event) {
    }

    @FXML
    private void onMailService(ActionEvent event) {
    }

    @FXML
    private void onConfirmationScreen(ActionEvent event) {
    }

    @FXML
    private void onLogOut(ActionEvent event) throws IOException {
        App.setRoot("PantallaInicio");
    }
    
}

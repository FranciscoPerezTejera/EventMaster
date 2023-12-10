package francisco.eventmaster.controladores;

import francisco.eventmaster.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;


public class PantallaListarEventoController implements Initializable {

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void onGoBack(ActionEvent event) throws IOException {
        App.setRoot("PantallaAdministracion");
    }

    @FXML
    private void onSearchEvent(ActionEvent event) {
        
    }

}

package francisco.eventmaster.controladores;

import francisco.eventmaster.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;

public class PantallaMensajeriaController implements Initializable {

    @FXML
    private HBox messageHBOX;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    @FXML
    private void onGoBack(ActionEvent event) throws IOException {
        App.setRoot("PantallaAdministracion");
    }

    @FXML
    private void onDeleteMessage(ActionEvent event) {
        messageHBOX.setVisible(false);
    }

}

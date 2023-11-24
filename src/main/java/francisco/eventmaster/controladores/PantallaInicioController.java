package francisco.eventmaster.controladores;

import francisco.eventmaster.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class PantallaInicioController implements Initializable {

    @FXML
    private Button loginButton;
    @FXML
    private TextField userTextfield;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Hyperlink signBottun;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onLoginAccion(ActionEvent event) {
    }

    @FXML
    private void onSignAction(ActionEvent event) throws IOException {
        App.setRoot("PantallaRegistro");
    }
    
}

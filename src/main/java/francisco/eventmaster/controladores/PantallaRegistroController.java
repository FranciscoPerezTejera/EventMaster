package francisco.eventmaster.controladores;

import francisco.eventmaster.App;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.util.Callback;
import javafx.util.StringConverter;


public class PantallaRegistroController implements Initializable {

    @FXML
    private Button goBackButton;
    @FXML
    private DatePicker bornDate;
    @FXML
    private Button registerButton;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
         bornDate.setConverter(new StringConverter<LocalDate>(){
             DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
             @Override
             public String toString(LocalDate date) {
                 if (date != null) {
                    return dateFormatter.format(date);
                }
                    return "";
             }

             @Override
             public LocalDate fromString(String string) {
                 if (string != null && !string.isEmpty()) {
                    return LocalDate.parse(string, dateFormatter);
                }
                    return null;
             }  
         }); 
              bornDate.setDayCellFactory(new Callback<DatePicker, DateCell>() {
            @Override
            public DateCell call(DatePicker param) {
                return new DateCell() {
                    @Override
                    public void updateItem(LocalDate item, boolean empty) {
                        super.updateItem(item, empty);
                        if (item != null) {
                                setStyle("-fx-text-fill: #004AAD;");
                        }
                    }
                };
            }
        });
    }    

    @FXML
    private void onGoBackButton(ActionEvent event) throws IOException {
        App.setRoot("PantallaInicio");
    }
    

    @FXML
    private void onRegisterButton(ActionEvent event) throws IOException {
        
        App.setRoot("PantallaAdministracion");
        
    }
    
}

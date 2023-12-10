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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.util.Callback;
import javafx.util.StringConverter;

public class PantallaEditarEventoController implements Initializable {

    @FXML
    private VBox eventEditVBox;
    @FXML
    private TextField nameEvent;
    @FXML
    private ComboBox<String> eventList;
    @FXML
    private TextField inviteNumber;
    @FXML
    private TextField eventLocation;
    @FXML
    private DatePicker datePicker;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        eventList.getItems().addAll("Boda", "Bautizo", "Comunión", "Cumpleaños", "Concierto");
        eventList.getSelectionModel().selectFirst();
        datePicker.setConverter(new StringConverter<LocalDate>() {
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
        datePicker.setDayCellFactory(new Callback<DatePicker, DateCell>() {
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
    private void onGoBack(ActionEvent event) throws IOException {

        App.setRoot("PantallaAdministracion");

    }

    @FXML
    private void onEditEvent(ActionEvent event) throws IOException {
        App.setRoot("PantallaAdministracion");
    }

    @FXML
    private void onSearchEventREF(ActionEvent event) {
        eventEditVBox.setDisable(false);
    }

}

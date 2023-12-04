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
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.util.Callback;
import javafx.util.StringConverter;

public class PantallaCrearEventoController implements Initializable {

    @FXML
    private ComboBox<String> eventTypeComboBox;
    @FXML
    private Spinner<Integer> guestCountSpinner;
    @FXML
    private DatePicker eventDateDatePicker;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        eventTypeComboBox.getItems().addAll("Boda", "Bautizo", "Comunión", "Cumpleaños", "Concierto");
        eventTypeComboBox.getSelectionModel().selectFirst();
        eventDateDatePicker.setConverter(new StringConverter<LocalDate>() {
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
        eventDateDatePicker.setDayCellFactory(new Callback<DatePicker, DateCell>() {
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
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, Integer.MAX_VALUE, 1);
        guestCountSpinner.setValueFactory(valueFactory);
        guestCountSpinner.getEditor().setStyle("-fx-text-fill: #004AAD; -fx-font-weight: bold; -fx-font-family: 'Arial';");
    }

    @FXML
    private void onGoBack(ActionEvent event) throws IOException {
        App.setRoot("PantallaAdministracion");
    }

    @FXML
    private void onEventCreate(ActionEvent event) throws IOException {
        App.setRoot("PantallaAdministracion");
    }

}

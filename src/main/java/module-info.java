module francisco.eventmaster {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens francisco.eventmaster to javafx.fxml;
    exports francisco.eventmaster;
    exports francisco.eventmaster.controladores;
    opens francisco.eventmaster.controladores;
}

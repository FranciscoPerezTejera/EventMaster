package francisco.eventmaster;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import javafx.scene.image.Image;


public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("PantallaInicio"), 640, 480);
         stage.widthProperty().addListener((o) -> {
            
             stage.setMinWidth(650);
        });
        stage.heightProperty().addListener((o) -> {
           
            stage.setMinHeight(500);
            
        });
        /*Image icon = new Image("src/main/resources/francisco/eventmaster/imagenes/logo_DAD_Definitivo.png");
        stage.getIcons().add(icon);*/
        stage.setTitle("EventMaster");
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
        
    }

}
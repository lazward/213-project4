import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 * 
 * This is the main driver class for the application, it allows the GUI to load its features as necessary.
 * 
 * @author Aarif Razak ahr58, Julian Lee jl2203
 */

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("project4.fxml"));
        primaryStage.setTitle("Project 4");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();

        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {

            @Override
            public void handle(WindowEvent event) {

                Platform.exit() ;

            }

        });

    }

    public static void main(String[] args) {

        launch(args) ;

    }
    
}

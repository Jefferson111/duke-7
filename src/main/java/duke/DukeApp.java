package duke;

import duke.ui.MainWindow;
import duke.ui.Stoppable;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DukeApp extends Application implements Stoppable {

    @Override
    public void start(Stage stage) throws Exception{
        try {
            MainWindow mainWindow = new MainWindow(stage);
            mainWindow.show();
            mainWindow.initialise(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        Platform.exit();
        System.exit(0);
    }

    public static void main(String[] args) {
        launch();
    }
}

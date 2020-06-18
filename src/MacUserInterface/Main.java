package MacUserInterface;

import ConnectToDatabase.ConnectToDatabase;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
        Main main = new Main();
        main.run();
        ConnectToDatabase.database();
    }

    public void run() {
        //MacManager is used to handle the import, validation and export
        //macManager = new MacManager();

        //Import, Validate, Export
        //macManager.importFile("sample.csv");
        //macManager.validateFile();
        //macManager.exportFile("macs.txt", "macsFAIL.txt");

    }

    /**
     * Loads GUI
     */

    static Stage primaryStage;

    public void start(Stage localPrimaryStage) throws Exception {
        primaryStage = localPrimaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("Mac Manager");
        primaryStage.setScene(new Scene(root, 964, 500));
        primaryStage.setResizable(false);

        primaryStage.initStyle(StageStyle.DECORATED);

        primaryStage.show();
    }

}

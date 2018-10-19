package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launcher extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("res/main_view.fxml"));
        
        Scene scene = new Scene(root, 800, 600);
        
        primaryStage.setTitle("Example Application");
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }
}

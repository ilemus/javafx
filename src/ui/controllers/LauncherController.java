package ui.controllers;

import java.io.File;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class LauncherController {
    public static Stage ownerStage = null; 
    @FXML protected void handleStartButton(ActionEvent event) {
        System.out.println("Button was pressed");
    }
    
    @FXML protected void handleOpenFile(ActionEvent event) {
        FileChooser fc = new FileChooser();
        fc.setTitle("Read CAN Log");
        fc.getExtensionFilters().addAll(new ExtensionFilter("ASCII File", "*.asc"), new ExtensionFilter("All", "*.*"));
        
        File selectedFile = fc.showOpenDialog(ownerStage);
        if (selectedFile != null) {
            System.out.println(selectedFile.getName());
        }
    }
}

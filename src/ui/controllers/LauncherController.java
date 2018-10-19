package ui.controllers;

import java.io.File;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
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
    
    @FXML private TextField search;
    protected final ContextMenu searchCtx = new ContextMenu();
    
    @FXML protected void searchHandler(KeyEvent event) {
        if (event.getEventType() == KeyEvent.KEY_PRESSED) {
            System.out.println("Typed: " + event.getCharacter());
            searchCtx.getItems().add(new MenuItem("Item!"));
        }
    }
}

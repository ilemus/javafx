package ui.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class LauncherController {
    @FXML protected void handleStartButton(ActionEvent event) {
        System.out.println("Button was pressed");
    }
    
    @FXML protected void handleOpenFile(ActionEvent event) {
        System.out.println("Should start get file");
    }
}

package com.example.alpbaba.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TabPane;

public class MainController {
    @FXML
    private TabPane mainTabPane;

    @FXML
    private void handleExit() {
        System.exit(0);
    }

    @FXML
    private void handleAbout() {
        // Show About Dialog
    }
}

package com.project.laba2timer;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TimerController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
package com.project.laba2timer;

import com.project.laba2timer.model.TimeMode;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.Spinner;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class SettingsController {
    public VBox container;
    @FXML private Spinner<Integer> pomodoroSpinner;
    @FXML private Spinner<Integer> shortBreakSpinner;
    @FXML private Spinner<Integer> longBreakSpinner;
    @FXML private Slider volumeSlider;

    @FXML
    public void initialize() {
        setSpinnerValues();
        volumeSlider.setValue(Settings.volume);
    }

    private void setSpinnerValues() {
        pomodoroSpinner.getValueFactory()
                .setValue(TimeMode.POMODORO.getMinutes());
        shortBreakSpinner.getValueFactory()
                .setValue(TimeMode.SHORT_BREAK.getMinutes());
        longBreakSpinner.getValueFactory()
                .setValue(TimeMode.LONG_BREAK.getMinutes());
    }

    public void saveBtnClicked() throws IOException {
        TimeMode.POMODORO.setMinutes(
                pomodoroSpinner.getValue());
        TimeMode.SHORT_BREAK.setMinutes(
                shortBreakSpinner.getValue());
        TimeMode.LONG_BREAK.setMinutes(
                longBreakSpinner.getValue());
        Settings.volume = volumeSlider.getValue();
        TimerApplication.setRoot("timer");
    }
}

module com.project.laba2timer {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.project.laba2timer to javafx.fxml;
    exports com.project.laba2timer;
}
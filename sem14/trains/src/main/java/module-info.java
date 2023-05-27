module trains {
    requires javafx.controls;
    requires javafx.fxml;

    opens trains to javafx.fxml;
    exports trains;
}

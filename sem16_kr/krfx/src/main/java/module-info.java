module krfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens krfx to javafx.fxml;
    exports krfx;
}

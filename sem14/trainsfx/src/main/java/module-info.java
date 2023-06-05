module trainsfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens trainsfx to javafx.fxml;
    exports trainsfx;
}

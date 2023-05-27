package trains;

import java.io.IOException;
import javafx.fxml.FXML;

public class TrainsListController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}
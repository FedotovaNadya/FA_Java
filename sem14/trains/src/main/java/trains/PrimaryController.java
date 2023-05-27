package trains;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("trainsList");
    }
    @FXML
    private void switchToAddTrian() throws IOException {
        App.setRoot("addTrain");
    }
}

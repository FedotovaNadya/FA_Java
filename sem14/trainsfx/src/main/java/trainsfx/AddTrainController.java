package trainsfx;

import java.io.IOException;
import javafx.fxml.FXML;


public class AddTrainController {
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}

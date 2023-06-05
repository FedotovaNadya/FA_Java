package trainsfx;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    @FXML
    private void switchToAddTrain() throws IOException{
        App.setRoot("addTrain");
    }
    @FXML
    private void switchToAddTrip() throws IOException{
        App.setRoot("addTrip");
    }
    @FXML
    private void switchToTrainsList() throws IOException{
        App.setRoot("trainsList");
        
    }
}

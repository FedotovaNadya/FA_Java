package krfx;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    private ObservableList<Film> filmsData = FXCollections.observableArrayList();

    @FXML
    private TableView<Film> tableFilms;

    @FXML
    private TableColumn<Film, Integer> idColumn;

    @FXML
    private TableColumn<Film, String> nameColumn;

    @FXML
    private TableColumn<Film, String> genreColumn;

    @FXML
    private TableColumn<Film, String> durationColumn;

    @FXML
    private TableColumn<Film, String> yearColumn;


}

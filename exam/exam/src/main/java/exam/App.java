
import javafx.application.Application;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


public class App extends Application {
    private Stage primaryStage;
    private PrimaryController hotelBookingFXController;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        private Stage stage;
    private TextField fileField;
    private Label result;
    public Label getResult() {
        return result;
    }


    public void setResult(String result) {
        this.result.setText(result);
    }


    public TextField getFileField() {
        return fileField;
    }


    public void setFileField(TextField fileField) {
        this.fileField = fileField;
    }


    private PrimaryController controller;
    public void setController(PrimaryController controller) {
        this.controller = controller;
    }

    
    public void display(Stage primaryStage) {
        stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(primaryStage);
        stage.setTitle("AVG");

        Label headlineLabel = new Label("Выберите файл с числами");
        headlineLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");
        fileField = new TextField();

        Button createButton = new Button("Вычислить среднее арифмитическое");
        createButton.setStyle("-fx-font-weight: bold; -fx-font-size: 14px;");
        createButton.setOnAction(e -> controller.calc());



        GridPane gridPane = new GridPane();
        gridPane.setPadding(new javafx.geometry.Insets(10, 20, 10, 20));
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        gridPane.add(headlineLabel, 0, 0, 2, 1);
        gridPane.add(fileField, 0, 1);
        gridPane.add(createButton, 0, 6, 2, 1);
        GridPane.setHalignment(createButton, javafx.geometry.HPos.RIGHT);

        javafx.scene.layout.ColumnConstraints column1 = new javafx.scene.layout.ColumnConstraints();
        column1.setPercentWidth(30);
        javafx.scene.layout.ColumnConstraints column2 = new javafx.scene.layout.ColumnConstraints();
        column2.setPercentWidth(70);
        gridPane.getColumnConstraints().addAll(column1, column2);

        javafx.scene.layout.RowConstraints rowConstraints = new javafx.scene.layout.RowConstraints();
        rowConstraints.setPrefHeight(30);
        gridPane.getRowConstraints().addAll(rowConstraints, rowConstraints, rowConstraints, rowConstraints, rowConstraints, rowConstraints);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(gridPane);
        

        Scene scene = new Scene(borderPane);
        stage.setScene(scene);


        primaryStage.show();
    }

}

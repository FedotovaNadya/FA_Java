package exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import exam.PrimaryView;


public class PrimaryController {
    private PrimaryView view;
    @FXML
    public void calc(){
        // App.setRoot("secondary");
        int numsCount=0;
        int numsSum=0;
        String fileName = view.getFileField().getText();
        File file = new File(fileName);
        try {

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                numsCount +=1;
                numsSum+=number;
            }
            float res = numsSum/numsCount;
            view.setResult(String.valueOf(res));
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка чтения файла " + fileName);
        }
    }
  
}

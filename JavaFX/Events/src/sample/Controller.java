package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField nameField;;
    public void onButtonClicked(){
        System.out.println(nameField.getText()+", you have clicked me");
    }
}

package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public TextArea areaCenter;
    @FXML
    public Button send;
    @FXML
    public TextField textField;

    @FXML
    public void clickSend(ActionEvent actionEvent) {
        areaCenter.appendText(textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();

    }
}

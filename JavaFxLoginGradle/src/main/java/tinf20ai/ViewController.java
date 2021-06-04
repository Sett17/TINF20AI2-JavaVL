package tinf20ai;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


public class ViewController {
    @FXML
    private TextField nameInput;
    @FXML
    private PasswordField passwordInput;

    public void onEnter(KeyEvent ke) {
        if (ke.getCode() == KeyCode.ENTER) {
            onLoginClick();
        }
    }

    public void onLoginClick() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Login");
        if (nameInput.getText().equals("klaus") && passwordInput.getText().equals("password")) {
            alert.setAlertType(Alert.AlertType.INFORMATION);
        }
        alert.setHeaderText(null);
        alert.setContentText(nameInput.getText().equals("klaus") && passwordInput.getText().equals("password") ?
                "Correct name and passord" :
                "Name or password incorrect");
        alert.showAndWait();
    }
}

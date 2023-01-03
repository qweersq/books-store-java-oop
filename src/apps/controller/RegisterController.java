package apps.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.Parent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.stage.Stage;
import javafx.scene.Scene;
import apps.object.ArrayListUser;

public class RegisterController implements Initializable {

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnRegister;

    @FXML
    private AnchorPane pnlMain;

    @FXML
    private TextField email;

    @FXML
    private TextField password;

    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnRegister) {
            String emailUser = email.getText();
            String passUser = password.getText();

            ArrayListUser.addUser(emailUser, passUser, "customer");

            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../fxml/LoginPage.fxml"));
                Parent root = loader.load();

                pnlMain.getChildren().setAll(root);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }

        } else if (event.getSource() == btnCancel) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../fxml/LoginPage.fxml"));
                Parent root = loader.load();
                pnlMain.getChildren().setAll(root);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }

}

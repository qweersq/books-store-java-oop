package apps.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.Parent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class LoginController implements Initializable {

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnRegister;

    @FXML
    private Button btnCustomer;

    @FXML
    private AnchorPane pnlChange;

    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnLogin) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../fxml/Sidebar.fxml"));
                Parent root = loader.load();

                pnlChange.getChildren().setAll(root);
            } catch (Exception e) {
                // TODO: handle exception
            }

        } else if (event.getSource() == btnRegister) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../fxml/RegisterPage.fxml"));
                Parent root = loader.load();
                pnlChange.getChildren().setAll(root);
            } catch (Exception e) {
                // TODO: handle exception
            }
        } else if (event.getSource() == btnCustomer) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../fxml/CustomerPage.fxml"));
                Parent root = loader.load();
                pnlChange.getChildren().setAll(root);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

}

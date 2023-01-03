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

public class LoginController implements Initializable {

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnRegister;

    @FXML
    private Button btnCustomer;

    @FXML
    private AnchorPane pnlChange;

    @FXML
    private TextField email;

    @FXML
    private TextField password;

    private int index = 0;

    public void initialize(URL location, ResourceBundle resources) {

    }

    // cecking if the user is admin or customer
    public boolean checkUser(String emailUser, String passUser) {
        for (int i = 0; i < ArrayListUser.getSize(); i++) {
            if (emailUser.equals(ArrayListUser.getUsername(i)) && passUser.equals(ArrayListUser.getPassword(i))) {
                index = i;
                return true;
            }
        }
        return false;
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnLogin) {
            String emailUser = email.getText();
            String passUser = password.getText();

            if (checkUser(emailUser, passUser)) {
                if (ArrayListUser.getRole(index).equals("admin")) {
                    try {
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(getClass().getResource("../fxml/Sidebar.fxml"));
                        Parent root = loader.load();
                        pnlChange.getChildren().setAll(root);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (ArrayListUser.getRole(index).equals("customer")) {
                    try {
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(getClass().getResource("../fxml/CustomerPage.fxml"));
                        Parent root = loader.load();
                        pnlChange.getChildren().setAll(root);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } else {
                System.out.println("Wrong email or password");
            }

            // try {
            //     FXMLLoader loader = new FXMLLoader();
            //     loader.setLocation(getClass().getResource("../fxml/Sidebar.fxml"));
            //     Parent root = loader.load();

            //     pnlChange.getChildren().setAll(root);
            // } catch (Exception e) {
            //     // TODO: handle exception
            // }

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

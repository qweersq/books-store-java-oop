
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

public class CustomerPageController implements Initializable {

    @FXML
    private Button btnPayment;

    @FXML
    private Button btnLogout;

    @FXML
    private AnchorPane pnlMain;

    public void initialize(URL location, ResourceBundle resources) {
    
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnPayment) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../fxml/StrukPage.fxml"));
                Parent root = loader.load();

                pnlMain.getChildren().setAll(root);
            } catch (Exception e) {
                // TODO: handle exception
            }

        } else if (event.getSource() == btnLogout) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../fxml/LoginPage.fxml"));
                Parent root = loader.load();

                pnlMain.getChildren().setAll(root);
            } catch (Exception e) {
                // TODO: handle exception
            }
        } 
    }

}

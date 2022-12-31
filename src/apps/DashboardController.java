package apps;

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

public class DashboardController implements Initializable {

    @FXML
    private Button btnDashboard;

    @FXML
    private Button btnBooks;

    @FXML
    private Pane pnlDashboard;

    @FXML
    private AnchorPane pnlChange;

    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        // if (event.getSource() == btnBooks) {
        //     try {
        //         FXMLLoader loader = new FXMLLoader();
        //         loader.setLocation(getClass().getResource("BooksPage.fxml"));
        //         Parent root = loader.load();

        //         pnlChange.getChildren().setAll(root);
        //     } catch (Exception e) {
        //         // TODO: handle exception
        //     }

        // } else if(event.getSource() == btnDashboard) {
        //     try {
        //         FXMLLoader loader = new FXMLLoader();
        //         loader.setLocation(getClass().getResource("DashboardPage.fxml"));
        //         Parent root = loader.load();

        //         pnlChange.getChildren().setAll(root);
        //     } catch (Exception e) {
        //         // TODO: handle exception
        //     }
        // }
}

}

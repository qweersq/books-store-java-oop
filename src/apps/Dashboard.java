package apps;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Dashboard implements Initializable{

    @FXML
    private Button btnDashboard;

    @FXML
    private Button btnBooks;

    @FXML
    private Pane pnlDashboard;

    @FXML
    private Pane pnlBooks;

    public void initialize(URL location, ResourceBundle resources) {
        // try {
        //     Pane dashboard = FXMLLoader.load(getClass().getResource("DashboardPage.fxml"));
        //     pnlDashboard.getChildren().setAll(dashboard);
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
    }

    public void handleClicks(ActionEvent actionEvent) {
        // if (actionEvent.getSource() == btnDashboard) {
        //     try {
        //         pnlDashboard.setStyle("-fx-background-color : #1620A1");
        //         // Pane dashboard = FXMLLoader.load(getClass().getResource("DashboardPage.fxml"));
        //         // pnlDashboard.getChildren().setAll(dashboard);
        //         pnlDashboard.toFront();
        //     } catch (IOException e) {
        //         e.printStackTrace();
        //     }
        // } else if (actionEvent.getSource() == btnBooks) {
        //     try {
        //         Pane books = FXMLLoader.load(getClass().getResource("BooksPage.fxml"));
        //         pnlBooks.getChildren().setAll(books);
        //         pnlDashboard.toFront();
        //     } catch (IOException e) {
        //         e.printStackTrace();
        //     }
        // }
    }

}

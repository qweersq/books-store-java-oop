package apps;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.layout.VBox;
import javafx.scene.Node;
import java.util.ArrayList;
import javafx.scene.control.Label;

import java.io.IOException;

public class DashboardController implements Initializable {
    private ArrayList<String> BooksTitle;

    @FXML
    private VBox pnItems = null;

    @FXML
    private Label bookTitle;

    public void initialize(URL location, ResourceBundle resources) {
        BooksTitle = new ArrayList<>();
        BooksTitle.add("The Alchemist");
        BooksTitle.add("The Book Thief");
        BooksTitle.add("The Kite Runner");
        BooksTitle.add("The Lord of the");
        BooksTitle.add("The Notebook");

        Node[] nodes = new Node[5];
        for (int i = 0; i < BooksTitle.size(); i++) {
            try {
                final int j = i;
                nodes[i] = FXMLLoader.load(getClass().getResource("TransactionList.fxml"));

                //give the items some effect
                nodes[i].setOnMouseEntered(event -> {
                    nodes[j].setStyle("-fx-background-color : #0A0E3F");
                });
                nodes[i].setOnMouseExited(event -> {
                    nodes[j].setStyle("-fx-background-color : #02030A");
                });

                //set the data to the labels
                bookTitle = (Label) nodes[i].lookup("#bookTitle");
                bookTitle.setText(BooksTitle.get(i));

                pnItems.getChildren().add(nodes[i]);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
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

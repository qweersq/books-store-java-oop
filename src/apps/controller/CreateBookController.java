package apps.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

import apps.object.ArrayListData;
import apps.object.BookNovel;
import javafx.scene.layout.VBox;
import javafx.scene.Node;
import java.util.ArrayList;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CreateBookController implements Initializable {

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnCreate;

    @FXML
    private AnchorPane pnlChange;

    @FXML
    private TextField txtTitle;

    @FXML
    private TextField txtAuthor;

    @FXML
    private TextField txtStock;

    @FXML
    private TextField txtPrice;

    @FXML
    private TextField txtCategory;

    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnCancel) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../fxml/BookList.fxml"));
                Parent root = loader.load();

                pnlChange.getChildren().setAll(root);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        } else if (event.getSource() == btnCreate) {
            try {
                String title = txtTitle.getText();
                String author = txtAuthor.getText();
                int stock = Integer.parseInt(txtStock.getText());
                int price = Integer.parseInt(txtPrice.getText());
                String category = txtCategory.getText();

                ArrayListData.addBook(title, author, category, stock, price);

                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../fxml/BookList.fxml"));
                Parent root = loader.load();

                pnlChange.getChildren().setAll(root);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

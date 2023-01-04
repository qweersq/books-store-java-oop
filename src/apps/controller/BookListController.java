package apps.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

import apps.object.ArrayListData;
import javafx.scene.layout.VBox;
import javafx.scene.Node;
import java.util.ArrayList;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.TextField;


import java.io.IOException;

public class BookListController implements Initializable {
    @FXML
    private VBox pnItemsBook = null;

    @FXML
    private Label idBook;

    @FXML
    private Label bookTitle;

    @FXML
    private Label bookAuthor;

    @FXML
    private Label bookCategory;

    @FXML
    private Label bookStock;

    @FXML
    private Label bookPrice;

    @FXML
    private Button btnEdit;

    @FXML
    private Button btnCreate;

    @FXML
    private Button btnDelete;

    @FXML
    private AnchorPane pnlChange;

    @FXML
    private TextField fieldId;

    public void initialize(URL location, ResourceBundle resources) {
        Node[] nodes = new Node[1000];
        for (int i = 0; i < ArrayListData.getSize(); i++) {
            try {
                final int j = i;
                nodes[i] = FXMLLoader.load(getClass().getResource("../fxml/itemBookRow.fxml"));

                // give the items some effect
                nodes[i].setOnMouseEntered(event -> {
                    nodes[j].setStyle("-fx-background-color : #0A0E3F");
                });
                nodes[i].setOnMouseExited(event -> {
                    nodes[j].setStyle("-fx-background-color : #02030A");
                });

                // set the data to the labels
                idBook = (Label) nodes[i].lookup("#idBook");
                idBook.setText((i + 1) + "");

                bookTitle = (Label) nodes[i].lookup("#bookTitle");
                bookTitle.setText(ArrayListData.getTitle(i));

                bookAuthor = (Label) nodes[i].lookup("#bookAuthor");
                bookAuthor.setText(ArrayListData.getAuthor(i));

                bookCategory = (Label) nodes[i].lookup("#bookCategory");
                bookCategory.setText(ArrayListData.getCategory(i));

                bookStock = (Label) nodes[i].lookup("#bookStock");
                bookStock.setText(ArrayListData.getStock(i) + "");

                bookPrice = (Label) nodes[i].lookup("#bookPrice");
                bookPrice.setText(ArrayListData.getPrice(i) + "");

                pnItemsBook.getChildren().add(nodes[i]);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnEdit) {
            try {
                EditBookController.idBookEdit = Integer.parseInt(fieldId.getText())-1;
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../fxml/BookEditor.fxml"));
                Parent root = loader.load();
    
                pnlChange.getChildren().setAll(root);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        } else if (event.getSource() == btnCreate) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../fxml/CreateBook.fxml"));
                Parent root = loader.load();
    
                pnlChange.getChildren().setAll(root);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        } else if (event.getSource() == btnDelete) {
            try {
                ArrayListData.deleteBook(Integer.parseInt(fieldId.getText())-1);
                
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../fxml/BookList.fxml"));
                Parent root = loader.load();
    
                pnlChange.getChildren().setAll(root);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }

}

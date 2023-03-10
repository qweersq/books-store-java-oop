package apps.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

import apps.object.ArrayListData;
import apps.object.ArrayListTrans;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.Node;
import javafx.scene.Parent;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class DashboardController implements Initializable {

    @FXML
    private VBox pnItems = null;

    @FXML
    private Label idTrans;

    @FXML
    private Label cusName;

    @FXML
    private Label bookTitle;

    @FXML
    private Label bookQty;

    @FXML
    private Label bookPrice;

    @FXML
    private Label bookAmount;

    @FXML
    private Button btnEdit;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnTransEbook;

    @FXML
    private TextField inputId;

    @FXML
    private AnchorPane pnlChange;

    private int idBook;

    public void initialize(URL location, ResourceBundle resources) {
       
        Node[] nodes = new Node[1000];
        for (int i = 0; i < ArrayListTrans.getSize(); i++) {
            try {
                final int j = i;
                nodes[i] = FXMLLoader.load(getClass().getResource("../fxml/TransactionList.fxml"));

                // give the items some effect
                nodes[i].setOnMouseEntered(event -> {
                    nodes[j].setStyle("-fx-background-color : #0A0E3F; -fx-background-radius: 10;");
                });
                nodes[i].setOnMouseExited(event -> {
                    nodes[j].setStyle("-fx-background-color : #02030A; -fx-background-radius: 10;");
                });

                // add the item to the flow pane
                idTrans = (Label) nodes[i].lookup("#idTrans");
                idTrans.setText((i + 1) + "");

                cusName = (Label) nodes[i].lookup("#cusName");
                cusName.setText(ArrayListTrans.getName(i));

                idBook = ArrayListTrans.getIdBook(i);

                System.out.println("IdBook" + idBook);

                bookTitle = (Label) nodes[i].lookup("#bookTitle");
                bookTitle.setText(ArrayListData.getTitle(idBook));

                bookQty = (Label) nodes[i].lookup("#bookQty");
                bookQty.setText(ArrayListTrans.getQty(i) + "");

                bookPrice = (Label) nodes[i].lookup("#bookPrice");
                bookPrice.setText(ArrayListData.getPrice(idBook) + "");

                bookAmount = (Label) nodes[i].lookup("#bookAmount");
                bookAmount.setText(ArrayListTrans.getAmount(i) + "");

                pnItems.getChildren().add(nodes[i]);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnEdit) {
            try {
                int idTransaction = Integer.parseInt(inputId.getText());
                EditTransController.idTransEdit = idTransaction;

                // EditBookController.idBookEdit = Integer.parseInt(inputId.getText())-1;
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../fxml/TransEditor.fxml"));
                Parent root = loader.load();
    
                pnlChange.getChildren().setAll(root);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        } else if (event.getSource() == btnDelete) {
            try {
                ArrayListTrans.removeTrans(Integer.parseInt(inputId.getText())-1);
                
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../fxml/DashboardPage.fxml"));
                Parent root = loader.load();
    
                pnlChange.getChildren().setAll(root);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        } else if (event.getSource() == btnTransEbook) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../fxml/TransactionEbookList.fxml"));
                Parent root = loader.load();
    
                pnlChange.getChildren().setAll(root);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }

}

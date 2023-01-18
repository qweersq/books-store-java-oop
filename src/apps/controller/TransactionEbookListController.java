
package apps.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

import apps.object.ArrayListEbook;
import apps.object.ArrayListTransEbook;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.Node;
import javafx.scene.Parent;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class TransactionEbookListController implements Initializable {

    @FXML
    private VBox pnItems = null;

    @FXML
    private Label idTrans;

    @FXML
    private Label cusName;

    @FXML
    private Label ebookTitle;

    @FXML
    private Label ebookFormat;

    @FXML
    private Label ebookPrice;

    @FXML
    private Label ebookSize;

    @FXML
    private Button btnEdit;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnBook;

    @FXML
    private TextField inputId;

    @FXML
    private AnchorPane pnlChange;

    @FXML 
    private int idEbook;

    public void initialize(URL location, ResourceBundle resources) {
       
        Node[] nodes = new Node[1000];
        for (int i = 0; i < ArrayListTransEbook.getSize(); i++) {
            try {
                final int j = i;
                nodes[i] = FXMLLoader.load(getClass().getResource("../fxml/itemEbookTransList.fxml"));

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
                cusName.setText(ArrayListTransEbook.getName(i));

                idEbook = ArrayListTransEbook.getIdEbook(i);

                ebookTitle = (Label) nodes[i].lookup("#ebookTitle");
                ebookTitle.setText(ArrayListEbook.getTitle(idEbook));

                ebookFormat = (Label) nodes[i].lookup("#ebookFormat");
                ebookFormat.setText(ArrayListEbook.getFormat(idEbook) + "");

                ebookSize = (Label) nodes[i].lookup("#ebookSize");
                ebookSize.setText(ArrayListEbook.getSize(idEbook) + " Mb");

                ebookPrice = (Label) nodes[i].lookup("#ebookPrice");
                ebookPrice.setText(ArrayListEbook.getPrice(idEbook) + "");

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

                EditTransEbookController.idTransEdit = Integer.parseInt(inputId.getText());
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../fxml/TransEbookEditor.fxml"));
                Parent root = loader.load();
    
                pnlChange.getChildren().setAll(root);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        } else if (event.getSource() == btnDelete) {
            try {
                ArrayListTransEbook.removeTrans(Integer.parseInt(inputId.getText())-1);
                
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../fxml/TransactionEbookList.fxml"));
                Parent root = loader.load();
    
                pnlChange.getChildren().setAll(root);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        } else if (event.getSource() == btnBook) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../fxml/DashboardPage.fxml"));
                Parent root = loader.load();
    
                pnlChange.getChildren().setAll(root);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }

}

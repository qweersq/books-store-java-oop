
package apps.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

import apps.object.ArrayListData;
import apps.object.ArrayListEbook;
import javafx.scene.layout.VBox;
import javafx.scene.Node;
import java.util.ArrayList;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.TextField;

import java.io.IOException;

public class EbookListController implements Initializable {
    @FXML
    private VBox pnItemsBook = null;

    @FXML
    private Label idBook;

    @FXML
    private Label idEbook;

    @FXML
    private Label ebookTitle;

    @FXML
    private Label ebookCategory;

    @FXML
    private Label ebookFormat;

    @FXML
    private Label ebookSize;

    @FXML
    private Label ebookPrice;

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
        for (int i = 0; i < ArrayListEbook.getSize(); i++) {
            try {
                final int j = i;
                nodes[i] = FXMLLoader.load(getClass().getResource("../fxml/itemEBookRow.fxml"));

                // give the items some effect
                nodes[i].setOnMouseEntered(event -> {
                    nodes[j].setStyle("-fx-background-color : #0A0E3F");
                });
                nodes[i].setOnMouseExited(event -> {
                    nodes[j].setStyle("-fx-background-color : #02030A");
                });

                // set the data to the labels
                idEbook = (Label) nodes[i].lookup("#idEbook");
                idEbook.setText((i + 1) + "");

                ebookTitle = (Label) nodes[i].lookup("#ebookTitle");
                ebookTitle.setText(ArrayListEbook.getTitle(i));

                ebookCategory = (Label) nodes[i].lookup("#ebookCategory");
                ebookCategory.setText(ArrayListEbook.getCategory(i));

                ebookFormat = (Label) nodes[i].lookup("#ebookFormat");
                ebookFormat.setText(ArrayListEbook.getFormat(i) + " Mb");

                ebookSize = (Label) nodes[i].lookup("#ebookSize");
                ebookSize.setText(ArrayListEbook.getSize(i) + "");

                ebookPrice = (Label) nodes[i].lookup("#ebookPrice");
                ebookPrice.setText(ArrayListEbook.getPrice(i) + "");

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
                EditEbookController.idEbookEdit = Integer.parseInt(fieldId.getText()) - 1;
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../fxml/EbookEditor.fxml"));
                Parent root = loader.load();

                pnlChange.getChildren().setAll(root);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        } else if (event.getSource() == btnCreate) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../fxml/CreateEbook.fxml"));
                Parent root = loader.load();

                pnlChange.getChildren().setAll(root);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        } else if (event.getSource() == btnDelete) {
            try {
                ArrayListEbook.deleteEbook(Integer.parseInt(fieldId.getText()) - 1);

                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../fxml/EbookList.fxml"));
                Parent root = loader.load();

                pnlChange.getChildren().setAll(root);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }

}

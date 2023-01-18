


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

import apps.object.ArrayListEbook;
import apps.object.ArrayListTransEbook;
import apps.object.ArrayListUser;

import java.io.IOException;
import javafx.scene.control.Label;
import javafx.scene.Node;

// import apps.object.ArrayListData;
// import apps.object.ArrayListTrans;
// import apps.object.ArrayListUser;

public class CustomerEbookPageController implements Initializable {

    @FXML
    private Button btnPayment;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnId;

    @FXML
    private Button btnBook;

    @FXML
    private Button btnEbook;

    @FXML
    private Button btnAudiobook;

    @FXML
    private AnchorPane pnlMain;

    @FXML
    private Pane pnItemsBook;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtTitle;

    @FXML
    private TextField txtFormat;

    @FXML
    private TextField txtPrice;

    @FXML
    private TextField txtSize;

    @FXML
    private TextField txtQty;

    @FXML
    private Label idBook;

    @FXML
    private Label ebookTitle;

    @FXML
    private Label ebookAuthor;

    @FXML
    private Label ebookCategory;

    @FXML
    private Label ebookStock;

    @FXML
    private Label ebookPrice;

    @FXML
    private Label ebookFormat;

    @FXML
    private Label ebookSize;

    @FXML
    private Label greetings;

    public static String greeting;

    public static int idCustomer;

    public void initialize(URL location, ResourceBundle resources) {
        greetings.setText(greeting);
        Node[] nodes = new Node[1000];
        for (int i = 0; i < ArrayListEbook.getSize(); i++) {
            try {
                final int j = i;
                nodes[i] = FXMLLoader.load(getClass().getResource("../fxml/EbookListCustomer.fxml"));

                // give the items some effect
                nodes[i].setOnMouseEntered(event -> {
                    nodes[j].setStyle("-fx-background-color : #0A0E3F");
                });
                nodes[i].setOnMouseExited(event -> {
                    nodes[j].setStyle("-fx-background-color : #02030A");
                });

                // set the data to the labels
                idBook = (Label) nodes[i].lookup("#idebook");
                idBook.setText((i + 1) + "");

                ebookTitle = (Label) nodes[i].lookup("#ebookTitle");
                ebookTitle.setText(ArrayListEbook.getTitle(i));

                // ebookAuthor = (Label) nodes[i].lookup("#ebookAuthor");
                // ebookAuthor.setText(ArrayListEbook.getAuthor(i));

                // ebookCategory = (Label) nodes[i].lookup("#ebookCategory");
                // ebookCategory.setText(ArrayListEbook.getCategory(i));

                // ebookStock = (Label) nodes[i].lookup("#ebookStock");
                // ebookStock.setText(ArrayListEbook.getStock(i) + "");

                ebookPrice = (Label) nodes[i].lookup("#ebookPrice");
                ebookPrice.setText(ArrayListEbook.getPrice(i) + "");

                ebookFormat = (Label) nodes[i].lookup("#ebookFormat");
                ebookFormat.setText(ArrayListEbook.getFormat(i));

                ebookSize = (Label) nodes[i].lookup("#ebookSize");
                ebookSize.setText(ArrayListEbook.getSize(i) + " Mb");
                

                pnItemsBook.getChildren().add(nodes[i]);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnPayment) {
            try {
                int ebookId = Integer.parseInt(txtId.getText())-1;

                ArrayListTransEbook.addTrans(ArrayListUser.getUsername(idCustomer), ebookId, Integer.parseInt(txtSize.getText()), txtFormat.getText());

                System.out.println("Ebook ID" + ebookId);

                StrukEbookPageController.idEbook = Integer.parseInt(txtId.getText());
                StrukEbookPageController.titleEbook = txtTitle.getText();
                StrukEbookPageController.formatEbook = txtFormat.getText();
                StrukEbookPageController.priceEbook = Integer.parseInt(txtPrice.getText());
                StrukEbookPageController.sizeEbook = Integer.parseInt(txtSize.getText());

                System.out.println("Transaction Success!");

                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../fxml/StrukEbookPage.fxml"));
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
        } else if (event.getSource() == btnId) {
            try {
                int id = Integer.parseInt(txtId.getText()) - 1;
                int price = ArrayListEbook.getPrice(id);

                txtTitle.setText(ArrayListEbook.getTitle(id));
                txtFormat.setText(ArrayListEbook.getFormat(id));
                txtPrice.setText(String.valueOf(price));
                txtSize.setText(String.valueOf(ArrayListEbook.getSize(id)));
            } catch (Exception e) {
                // TODO: handle exception
            }
        } else if (event.getSource() == btnEbook) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../fxml/CustomerEbookPage.fxml"));
                Parent root = loader.load();

                pnlMain.getChildren().setAll(root);
            } catch (Exception e) {
                // TODO: handle exception
            }
        } else if (event.getSource() == btnBook) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../fxml/CustomerPage.fxml"));
                Parent root = loader.load();

                pnlMain.getChildren().setAll(root);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

}

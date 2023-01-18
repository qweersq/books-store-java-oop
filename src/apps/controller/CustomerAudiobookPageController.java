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
import java.io.IOException;
import javafx.scene.control.Label;
import javafx.scene.Node;

// import apps.object.ArrayListData;
// import apps.object.ArrayListTrans;
// import apps.object.ArrayListUser;

public class CustomerAudiobookPageController implements Initializable {

    @FXML
    private Button btnPayment;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnId;

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
    private TextField txtAuthor;

    @FXML
    private TextField txtPrice;

    @FXML
    private TextField txtAmount;

    @FXML
    private TextField txtQty;

    @FXML
    private Label idBook;

    @FXML
    private Label audiobookTitle;

    @FXML
    private Label audiobookAuthor;

    @FXML
    private Label audiobookCategory;

    @FXML
    private Label audiobookStock;

    @FXML
    private Label audiobookPrice;

    @FXML
    private Label greetings;

    public static String greeting;

    public static int idCustomer;

    // public static void setGreeting(int index) {
    //     CustomerPageController.greeting = "Hello, " + ArrayListUser.getUsername(index) + "!";
    // }

    public void initialize(URL location, ResourceBundle resources) {
        // greetings.setText(greeting);
        // Node[] nodes = new Node[1000];
        // for (int i = 0; i < ArrayListData.getSize(); i++) {
        //     try {
        //         final int j = i;
        //         nodes[i] = FXMLLoader.load(getClass().getResource("../fxml/BookListCustomer.fxml"));

        //         // give the items some effect
        //         nodes[i].setOnMouseEntered(event -> {
        //             nodes[j].setStyle("-fx-background-color : #0A0E3F");
        //         });
        //         nodes[i].setOnMouseExited(event -> {
        //             nodes[j].setStyle("-fx-background-color : #02030A");
        //         });

        //         // set the data to the labels
        //         idBook = (Label) nodes[i].lookup("#idBook");
        //         idBook.setText((i + 1) + "");

        //         audiobookTitle = (Label) nodes[i].lookup("#audiobookTitle");
        //         audiobookTitle.setText(ArrayListData.getTitle(i));

        //         audiobookAuthor = (Label) nodes[i].lookup("#audiobookAuthor");
        //         audiobookAuthor.setText(ArrayListData.getAuthor(i));

        //         // audiobookCategory = (Label) nodes[i].lookup("#audiobookCategory");
        //         // audiobookCategory.setText(ArrayListData.getCategory(i));

        //         audiobookStock = (Label) nodes[i].lookup("#audiobookStock");
        //         audiobookStock.setText(ArrayListData.getStock(i) + "");

        //         audiobookPrice = (Label) nodes[i].lookup("#audiobookPrice");
        //         audiobookPrice.setText(ArrayListData.getPrice(i) + "");

        //         pnItemsBook.getChildren().add(nodes[i]);

        //     } catch (IOException e) {
        //         e.printStackTrace();
        //     }
        // }
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        // if (event.getSource() == btnPayment) {
        //     try {
        //         ArrayListTrans.addTrans(ArrayListUser.getUsername(idCustomer), Integer.parseInt(txtId.getText()), Integer.parseInt(txtQty.getText()), Integer.parseInt(txtAmount.getText()));

        //         int audiobookId = Integer.parseInt(txtId.getText());
        //         ArrayListData.setStock(audiobookId, ArrayListData.getStock(audiobookId) - Integer.parseInt(txtQty.getText()));

        //         StrukPageController.idBook = Integer.parseInt(txtId.getText());
        //         StrukPageController.titleBook = txtTitle.getText();
        //         StrukPageController.authorBook = txtAuthor.getText();
        //         StrukPageController.priceBook = Integer.parseInt(txtPrice.getText());
        //         StrukPageController.qtyBook = Integer.parseInt(txtQty.getText());
        //         StrukPageController.amountBook = Integer.parseInt(txtAmount.getText());

        //         System.out.println("Transaction Success!");

        //         FXMLLoader loader = new FXMLLoader();
        //         loader.setLocation(getClass().getResource("../fxml/StrukPage.fxml"));
        //         Parent root = loader.load();

        //         pnlMain.getChildren().setAll(root);
        //     } catch (Exception e) {
        //         // TODO: handle exception
        //     }

        // } else if (event.getSource() == btnLogout) {
        //     try {
        //         FXMLLoader loader = new FXMLLoader();
        //         loader.setLocation(getClass().getResource("../fxml/LoginPage.fxml"));
        //         Parent root = loader.load();

        //         pnlMain.getChildren().setAll(root);
        //     } catch (Exception e) {
        //         // TODO: handle exception
        //     }
        // } else if (event.getSource() == btnId) {
        //     try {
        //         int id = Integer.parseInt(txtId.getText()) - 1;

        //         int qty = Integer.parseInt(txtQty.getText());
        //         int price = ArrayListData.getPrice(id);
        //         int stock = ArrayListData.getStock(id);
        //         int amount = price * qty;
        //         System.out.println(amount);

        //         ArrayListData.setStock(id, stock - qty);

        //         txtTitle.setText(ArrayListData.getTitle(id));
        //         txtAuthor.setText(ArrayListData.getAuthor(id));
        //         txtPrice.setText(String.valueOf(price));
        //         txtAmount.setText(String.valueOf(amount));
        //     } catch (Exception e) {
        //         // TODO: handle exception
        //     }
        // }
    }

}

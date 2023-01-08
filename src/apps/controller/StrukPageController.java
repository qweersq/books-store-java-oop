package apps.controller;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Button;



import java.net.URL;
import java.util.ResourceBundle;

public class StrukPageController implements Initializable {
    public static int idBook;
    public static String titleBook;
    public static String authorBook;
    public static int priceBook;
    public static int qtyBook;
    public static int amountBook;

    @FXML
    private Label lblIdTrans;

    @FXML
    private Label lblTitle;

    @FXML
    private Label lblPrice;

    @FXML
    private Label lblQty;

    @FXML
    private Label lblAmount;

    @FXML
    private AnchorPane pnlMain;

    @FXML
    private Button btnBack;

    
    public void initialize(URL location, ResourceBundle resources) {
        lblTitle.setText(titleBook);
        lblPrice.setText(Integer.toString(priceBook));
        lblQty.setText(Integer.toString(qtyBook));
        lblAmount.setText(Integer.toString(amountBook));
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnBack) {
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

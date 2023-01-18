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

public class StrukEbookPageController implements Initializable {
    public static int idEbook;
    public static String titleEbook;
    public static String formatEbook;
    public static int priceEbook;
    public static int sizeEbook;

    @FXML
    private Label lblIdTrans;

    @FXML
    private Label lblTitle;

    @FXML
    private Label lblPrice;

    @FXML
    private Label lblFormat;

    @FXML
    private Label lblSize;

    @FXML
    private AnchorPane pnlMain;

    @FXML
    private Button btnBack;

    
    public void initialize(URL location, ResourceBundle resources) {
        lblTitle.setText(titleEbook);
        lblPrice.setText(Integer.toString(priceEbook));
        lblFormat.setText(formatEbook);
        lblSize.setText(Integer.toString(sizeEbook));
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnBack) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../fxml/CustomerEbookPage.fxml"));
                Parent root = loader.load();

                pnlMain.getChildren().setAll(root);
            } catch (Exception e) {
                // TODO: handle exception
            }

        } 
    }


}

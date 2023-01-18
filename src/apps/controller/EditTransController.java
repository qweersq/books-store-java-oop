
package apps.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

import apps.object.ArrayListData;
import apps.object.ArrayListTrans;
import javafx.scene.layout.VBox;
import javafx.scene.Node;
import java.util.ArrayList;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.TextField;

import java.io.IOException;

public class EditTransController implements Initializable {

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnSave;

    @FXML
    private Button btnCheckBook;

    @FXML
    private AnchorPane pnlChange;

    @FXML
    private TextField txtCusName;

    @FXML
    private TextField txtIDEdit;

    @FXML
    private TextField txtQtyEdit;

    @FXML
    private TextField txtBookTitle;

    @FXML
    private TextField txtPriceEdit;

    @FXML
    private TextField txtCategoryEdit;

    @FXML
    private TextField txtAmountEdit;

    @FXML
    private TextField idTrans;

    public static int idTransEdit;

    public void initialize(URL location, ResourceBundle resources) {
        int idT = idTransEdit - 1;
        idTrans.setText(idTransEdit + "");
        txtCusName.setText(ArrayListTrans.getName(idT));
        txtQtyEdit.setText(ArrayListTrans.getQty(idT) + "");
        txtIDEdit.setText(ArrayListTrans.getIdBook(idT) + "");

        int idBook = ArrayListTrans.getIdBook(idT);

        txtIDEdit.setText((idBook+1) + "");
        txtBookTitle.setText(ArrayListData.getTitle(idBook));
        txtPriceEdit.setText(ArrayListData.getPrice(idBook) + "");
        txtCategoryEdit.setText(ArrayListData.getCategory(idBook));
        txtAmountEdit.setText(ArrayListTrans.getAmount(idT) + "");

    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnCancel) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../fxml/DashboardPage.fxml"));
                Parent root = loader.load();

                pnlChange.getChildren().setAll(root);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        } else if (event.getSource() == btnCheckBook) {
            int idBook = Integer.parseInt(txtIDEdit.getText()) - 1;
            int qtyBook = Integer.parseInt(txtQtyEdit.getText());
            int getAmount = ArrayListData.getPrice(idBook) * qtyBook;

            System.out.println(ArrayListData.getTitle(idBook));

            txtBookTitle.setText(ArrayListData.getTitle(idBook));
            txtPriceEdit.setText(ArrayListData.getPrice(idBook) + "");
            txtCategoryEdit.setText(ArrayListData.getCategory(idBook));
            txtAmountEdit.setText(getAmount + "");

        } else if (event.getSource() == btnSave) {
            int idT = idTransEdit - 1;
            int idBook = Integer.parseInt(txtIDEdit.getText()) - 1;

            ArrayListTrans.setName(idT, txtCusName.getText());
            ArrayListTrans.setQty(idT, Integer.parseInt(txtQtyEdit.getText()));
            ArrayListTrans.setIdBook(idT, idBook);
            ArrayListTrans.setAmountTrans(idT, Integer.parseInt(txtAmountEdit.getText()));

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

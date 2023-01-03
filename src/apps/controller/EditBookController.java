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

public class EditBookController implements Initializable {

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnSave;

    @FXML
    private AnchorPane pnlChange;

    @FXML
    private TextField txtTitleEdit;

    @FXML
    private TextField txtAuthorEdit;

    @FXML
    private TextField txtStockEdit;

    @FXML
    private TextField txtPriceEdit;

    @FXML
    private TextField txtCategoryEdit;

    public static int idBookEdit;

    public void initialize(URL location, ResourceBundle resources) {
        txtTitleEdit.setText(ArrayListData.getTitle(idBookEdit));
        txtAuthorEdit.setText(ArrayListData.getAuthor(idBookEdit));
        txtStockEdit.setText(String.valueOf(ArrayListData.getStock(idBookEdit)));
        txtPriceEdit.setText(String.valueOf(ArrayListData.getPrice(idBookEdit)));
        txtCategoryEdit.setText(ArrayListData.getCategory(idBookEdit));
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
        } else if (event.getSource() == btnSave) {
            try {
                ArrayListData.setTitle(idBookEdit, txtTitleEdit.getText());
                ArrayListData.setAuthor(idBookEdit, txtAuthorEdit.getText());
                ArrayListData.setStock(idBookEdit, Integer.parseInt(txtStockEdit.getText()));
                ArrayListData.setPrice(idBookEdit, Integer.parseInt(txtPriceEdit.getText()));
                ArrayListData.setCategory(idBookEdit, txtCategoryEdit.getText());
                
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

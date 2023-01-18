package apps.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

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

public class EditEbookController implements Initializable {

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnSave;

    @FXML
    private AnchorPane pnlChange;

    @FXML
    private TextField txtTitleEdit;

    @FXML
    private TextField txtFormatEdit;

    @FXML
    private TextField txtStockEdit;

    @FXML
    private TextField txtPriceEdit;

    @FXML
    private TextField txtSizeEdit;

    @FXML
    private TextField txtCategoryEdit;

    public static int idEbookEdit;

    public void initialize(URL location, ResourceBundle resources) {
        txtTitleEdit.setText(ArrayListEbook.getTitle(idEbookEdit));
        txtFormatEdit.setText(ArrayListEbook.getFormat(idEbookEdit));
        txtSizeEdit.setText(String.valueOf(ArrayListEbook.getSize(idEbookEdit)));
        txtPriceEdit.setText(String.valueOf(ArrayListEbook.getPrice(idEbookEdit)));
        txtCategoryEdit.setText(ArrayListEbook.getCategory(idEbookEdit));

    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnCancel) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../fxml/EbookList.fxml"));
                Parent root = loader.load();

                pnlChange.getChildren().setAll(root);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        } else if (event.getSource() == btnSave) {
            try {
                ArrayListEbook.setTitle(idEbookEdit, txtTitleEdit.getText());
                ArrayListEbook.setFormat(idEbookEdit, txtFormatEdit.getText());
                ArrayListEbook.setSize(idEbookEdit, Integer.parseInt(txtSizeEdit.getText()));
                ArrayListEbook.setPrice(idEbookEdit, Integer.parseInt(txtPriceEdit.getText()));
                ArrayListEbook.setCategory(idEbookEdit, txtCategoryEdit.getText());
                
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


package apps.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

import apps.object.ArrayListEbook;
import apps.object.ArrayListTransEbook;
import javafx.scene.layout.VBox;
import javafx.scene.Node;
import java.util.ArrayList;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.TextField;

import java.io.IOException;

public class EditTransEbookController implements Initializable {

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnSave;

    @FXML
    private Button btnCheckEbook;

    @FXML
    private AnchorPane pnlChange;

    @FXML
    private TextField txtCusName;

    @FXML
    private TextField txtIDEdit;

    @FXML
    private TextField txtFormatEdit;

    @FXML
    private TextField txtEbookTitle;

    @FXML
    private TextField txtPriceEdit;

    @FXML
    private TextField txtSizeEdit;

    @FXML
    private TextField idTrans;

    public static int idTransEdit;

    public void initialize(URL location, ResourceBundle resources) {
        int idT = idTransEdit - 1;
        idTrans.setText(idTransEdit + "");
        txtCusName.setText(ArrayListTransEbook.getName(idT));
        txtIDEdit.setText(ArrayListTransEbook.getIdEbook(idT) + "");

        int idEbook = ArrayListTransEbook.getIdEbook(idT);

        txtIDEdit.setText((idEbook+1) + "");
        txtEbookTitle.setText(ArrayListEbook.getTitle(idEbook));
        txtPriceEdit.setText(ArrayListEbook.getPrice(idEbook) + "");
        txtFormatEdit.setText(ArrayListEbook.getFormat(idEbook));
        txtSizeEdit.setText(ArrayListTransEbook.getSize(idEbook) + "");

    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnCancel) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../fxml/TransactionEbookList.fxml"));
                Parent root = loader.load();

                pnlChange.getChildren().setAll(root);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        } else if (event.getSource() == btnCheckEbook) {
            int idEbook = Integer.parseInt(txtIDEdit.getText()) - 1;

            System.out.println(ArrayListEbook.getTitle(idEbook));

            txtEbookTitle.setText(ArrayListEbook.getTitle(idEbook));
            txtFormatEdit.setText(ArrayListEbook.getFormat(idEbook) + "");
            txtSizeEdit.setText(ArrayListEbook.getSize(idEbook) + "");
            txtPriceEdit.setText(ArrayListEbook.getPrice(idEbook) + "");

        } else if (event.getSource() == btnSave) {
            int idT = idTransEdit - 1;
            int idEbook = Integer.parseInt(txtIDEdit.getText()) - 1;

            ArrayListTransEbook.setIdEbook(idT, idEbook);

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

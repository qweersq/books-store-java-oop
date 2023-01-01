package apps.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

import apps.books.BookNovel;
import javafx.scene.layout.VBox;
import javafx.scene.Node;
import java.util.ArrayList;
import javafx.scene.control.Label;

import java.io.IOException;

public class BookListController implements Initializable {
    @FXML
    private VBox pnItemsBook = null;

    @FXML
    private Label idBook;

    @FXML
    private Label bookTitle;

    @FXML
    private Label bookAuthor;

    @FXML
    private Label bookCategory;

    @FXML
    private Label bookStock;

    @FXML
    private Label bookPrice;

    public void initialize(URL location, ResourceBundle resources) {
        BookNovel harryPotter = new BookNovel("Harry Potter and the Philosopher", "J.K. Rowling", 50, 70000);

        BookNovel harryPotter2 = new BookNovel("Harry Potter and the Chamber of", "J.K. Rowling", 40, 60000);

        BookNovel harryPotter3 = new BookNovel("Harry Potter and the Prisoner of Azkaban", "J.K. Rowling", 35, 50000);

        ArrayList<BookNovel> BookNovels = new ArrayList<>();
        BookNovels.add(harryPotter);
        BookNovels.add(harryPotter2);
        BookNovels.add(harryPotter3);

        Node[] nodes = new Node[5];
        for (int i = 0; i < BookNovels.size(); i++) {
            try {
                final int j = i;
                nodes[i] = FXMLLoader.load(getClass().getResource("../fxml/itemBookRow.fxml"));

                // give the items some effect
                nodes[i].setOnMouseEntered(event -> {
                    nodes[j].setStyle("-fx-background-color : #0A0E3F");
                });
                nodes[i].setOnMouseExited(event -> {
                    nodes[j].setStyle("-fx-background-color : #02030A");
                });

                // set the data to the labels
                idBook = (Label) nodes[i].lookup("#idBook");
                idBook.setText((i + 1) + "");

                bookTitle = (Label) nodes[i].lookup("#bookTitle");
                bookTitle.setText(BookNovels.get(i).getTitle());

                bookAuthor = (Label) nodes[i].lookup("#bookAuthor");
                bookAuthor.setText(BookNovels.get(i).getAuthor());

                bookCategory = (Label) nodes[i].lookup("#bookCategory");
                bookCategory.setText(BookNovels.get(i).getCategory());

                bookStock = (Label) nodes[i].lookup("#bookStock");
                bookStock.setText(BookNovels.get(i).getStock() + "");

                bookPrice = (Label) nodes[i].lookup("#bookPrice");
                bookPrice.setText(BookNovels.get(i).getPrice() + "");

                pnItemsBook.getChildren().add(nodes[i]);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
    }

}

package apps;

import apps.object.ArrayListAudiobook;
import apps.object.ArrayListData;
import apps.object.ArrayListEbook;
import apps.object.ArrayListTrans;
import apps.object.ArrayListTransEbook;
import apps.object.ArrayListUser;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Main extends Application {
    // define your offsets here
    private double xOffset = 0;
    private double yOffset = 0;

    // set value arraylist
    public void setInitialValue() {
        ArrayListUser.addUser("admin", "admin", "admin");
        ArrayListUser.addUser("hadad", "hadad", "customer");

        ArrayListTrans.addTrans("Rifaldi Indrajaya", 1, 3, 30000);
        ArrayListTrans.addTrans("Hadad Al Akbar", 2, 4, 40000);
        ArrayListTrans.addTrans("Athailah Adhar", 3, 5, 50000);

        ArrayListTransEbook.addTrans("Noval", 0, 40, "pdf");
        ArrayListTransEbook.addTrans("Hadad", 1, 50, "epub");
        ArrayListTransEbook.addTrans("Athailah", 2, 60, "mobi");


        ArrayListData.addBook("Harry Potter", "J.K. Rowling", "Novel", 10, 10000);
        ArrayListData.addBook("The Lord of the Rings", "J.R.R. Tolkien", "Novel", 10, 10000);
        ArrayListData.addBook("The Hobbit", "J.R.R. Tolkien", "Novel", 10, 10000);
        ArrayListData.addBook("The Da Vinci Code", "Dan Brown", "Novel", 10, 10000);
        ArrayListData.addBook("The Alchemist", "Paulo Coelho", "Novel", 10, 10000);
        ArrayListData.addBook("The Kite Runner", "Khaled Hosseini", "Novel", 10, 10000);
        ArrayListData.addBook("The Book Thief", "Markus Zusak", "Novel", 10, 10000);
        ArrayListData.addBook("The Fault in Our Stars", "John Green", "Novel", 10, 10000);
        ArrayListData.addBook("The Fault Stars", "John Green", "Novel", 10, 10000);
        ArrayListData.addBook("The Runner", "Khaled Hosseini", "Novel", 10, 10000);

        // ebook
        ArrayListEbook.addEbook("Harry Potter", "J.K. Rowling", 10000, "pdf", 40);
        ArrayListEbook.addEbook("The Lord of the Rings", "J.R.R. Tolkien", 11000, "epub", 50);
        ArrayListEbook.addEbook("The Hobbit", "J.R.R. Tolkien", 12000, "mobi", 60);

        // audiobook
        ArrayListAudiobook.addAudiobook("Harry Potter", "J.K. Rowling",10000, "M. Farids", 1300);
        ArrayListAudiobook.addAudiobook("The Lord of the Rings", "J.R.R. Tolkien",11000, "M. Faldi", 1400);
        ArrayListAudiobook.addAudiobook("The Hobbit", "J.R.R. Tolkien",12000, "M. Athailah", 1500);
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        setInitialValue();

        Parent root = FXMLLoader.load(getClass().getResource("fxml/LoginPage.fxml"));
        primaryStage.initStyle(StageStyle.TRANSPARENT);

        // grab your root here
        root.setOnMousePressed(event -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });

        // move around here
        root.setOnMouseDragged(event -> {
            primaryStage.setX(event.getScreenX() - xOffset);
            primaryStage.setY(event.getScreenY() - yOffset);
        });
        Scene scene = new Scene(root);
        // set transparent
        scene.setFill(Color.TRANSPARENT);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

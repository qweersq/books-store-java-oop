package apps;

import apps.object.ArrayListData;
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

        ArrayListData.addBook("Harry Potter", "J.K. Rowling", "Novel", 10, 10000);
        ArrayListData.addBook("The Lord of the Rings", "J.R.R. Tolkien", "Novel", 10, 10000);
        ArrayListData.addBook("The Hobbit", "J.R.R. Tolkien", "Novel", 10, 10000);
        ArrayListData.addBook("The Da Vinci Code", "Dan Brown", "Novel", 10, 10000);
        ArrayListData.addBook("The Alchemist", "Paulo Coelho", "Novel", 10, 10000);
        ArrayListData.addBook("The Kite Runner", "Khaled Hosseini", "Novel", 10, 10000);
        ArrayListData.addBook("The Book Thief", "Markus Zusak", "Novel", 10, 10000);
        ArrayListData.addBook("The Fault in Our Stars", "John Green", "Novel", 10, 10000);
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

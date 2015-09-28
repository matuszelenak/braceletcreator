package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("layout.fxml"));
        Parent root = loader.load();
        Controller controller = loader.getController();
        BraceletModel model = new BraceletModel();
        View view = new View();


        controller.setModel(model);
        controller.setView(view);
        view.setModel(model);
        primaryStage.setMinWidth(300);
        primaryStage.setMinHeight(300);
        primaryStage.setTitle("Bracelet Creator 1.0 alpha");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.MenuBar;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    private View view;

    private BraceletModel model;

    @FXML
    AnchorPane pane;
    @FXML
    MenuBar menuBar;
    @FXML
    Canvas mainCanvas;

    public void showModel(){
        view.showModel(pane);
    }

    public void setView(View view){
        this.view = view;
    }

    @FXML
    protected void handlePaneClick(MouseEvent event) {
        model.addKnot(event.getX(),event.getY(), Color.BLACK);
        view.showModel(pane);
    }

    public void setModel(BraceletModel model) {
        this.model = model;
    }

    @Override
    public void initialize(URL fxmlFileLocation, ResourceBundle resources) {

    }

}

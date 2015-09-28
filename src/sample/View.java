package sample;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Polygon;

/**
 * Created by whiskas on 9/28/15.
 */
public class View {

    BraceletModel model;

    View(){

    }

    public void updateView(){

    }

    public void showModel(AnchorPane pane){
        for (Thread T : model.Threads){

        }
        for (Knot K : model.Knots){
            KnotPolygon P = new KnotPolygon(K.getHitboxVertices());
            P.setFill(K.getColor());
            pane.getChildren().add(P);
        }
    }

    public void setModel(BraceletModel model) {
        this.model = model;
    }
}

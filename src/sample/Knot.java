package sample;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by whiskas on 9/28/15.
 */
public class Knot {
    Point2D position;
    Color color;
    String selectionState;
    ArrayList<Point2D> hitboxVertices;
    public Knot(double x, double y, Color color){
        selectionState = "idle";
        position = new Point2D(x,y);
        hitboxVertices = new ArrayList<>();
        updateHitbox();
        this.setColor(color);
    }

    private void updateHitbox(){
        hitboxVertices = new ArrayList<>(Arrays.asList(
                new Point2D(position.getX() - 10, position.getY() - 10),
                new Point2D(position.getX() + 10, position.getY() - 10),
                new Point2D(position.getX() + 10, position.getY() + 10),
                new Point2D(position.getX() - 10, position.getY() + 10)
                ));
    }

    public String getSelectionState() {
        return selectionState;
    }

    public void setSelectionState(String selectionState) {
        this.selectionState = selectionState;
    }

    public double[] getHitboxVertices(){
        double[] res = new double[hitboxVertices.size()*2];
        int index = 0;
        for (Point2D P : hitboxVertices){
            res[index] = P.getX();
            index++;
            res[index] = P.getY();
            index++;
        }
        return res;
    }

    public void setHitboxVertices(ArrayList<Point2D> hitboxVertices) {
        this.hitboxVertices = hitboxVertices;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

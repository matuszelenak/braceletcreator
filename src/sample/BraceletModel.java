package sample;

import javafx.scene.paint.Color;

import java.util.ArrayList;

/**
 * Created by whiskas on 9/28/15.
 */
public class BraceletModel {
    ArrayList<Knot> Knots;
    ArrayList<Thread> Threads;

    public BraceletModel(){
        Knots = new ArrayList<>();
        Threads = new ArrayList<>();
    }

    public void addKnot(double x, double y, Color color){
        Knots.add(new Knot(x,y,color));
    }
}

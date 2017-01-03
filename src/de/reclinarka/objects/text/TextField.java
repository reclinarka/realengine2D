package de.reclinarka.objects.text;

import de.reclinarka.objects.Coordinate;
import de.reclinarka.objects.Drawable;

import java.awt.*;

/**
 * Created by reclinarka on 29.12.2016.
 */
public class TextField implements Drawable{

    public TextField(String[] content, int mapX, int mapY, float speed, int size, int decay){
        this.content = content;
        pos = new Coordinate(mapX,mapY);
        steps = (int) (speed * 120);
        drawer = new TextDrawer(pos,steps,decay);
        this.size = size;
    }

    public TextField(){

    }

    private int size;
    private int steps;
    private TextDrawer drawer;
    private String[] content;
    private Coordinate pos;


    @Override
    public void draw(Graphics g, int zoom) {

            g.setFont(g.getFont().deriveFont((float) (size * zoom) ));
            drawer.draw(g, content, zoom, size);


    }

    public void setSteps(int steps) {
        this.steps = steps;

    }

    @Override
    public Coordinate getPos() {
        return pos;
    }
}

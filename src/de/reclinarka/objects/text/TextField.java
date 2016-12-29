package de.reclinarka.objects.text;

import de.reclinarka.objects.Coordinate;
import de.reclinarka.objects.Drawable;

import java.awt.*;

/**
 * Created by reclinarka on 29.12.2016.
 */
public class TextField implements Drawable{

    public TextField(String[] content){
        this.content = content;
        lines = content.length - 1;
        drawer = new TextDrawer(0);
    }
    private int speed;
    private TextDrawer drawer;
    private String[] content;
    private int lines;
    private Coordinate pos;

    @Override
    public void draw(Graphics g) {
        drawer.draw(content);
    }

    @Override
    public Coordinate getPos() {
        return pos;
    }
}

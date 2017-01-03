package de.reclinarka.objects.text;

import de.reclinarka.graphics.GraphicsHandler;
import de.reclinarka.objects.Coordinate;
import de.reclinarka.objects.Drawable;
import de.reclinarka.objects.animation.Animation;
import de.reclinarka.objects.text.dialogue.DialogueAnimator;

import java.awt.*;

/**
 * Created by reclinarka on 29.12.2016.
 */
public class TextField implements Drawable {

    public TextField(String[] content, int mapX, int mapY, float speed, int size, int decay, String ID) {
        this.content = content;
        pos = new Coordinate(mapX, mapY);
        steps = (int) (speed * 120);
        drawer = new TextDrawer(pos, steps, decay);
        this.size = size;
        this.ID = ID;
    }

    public TextField(String[] content, int mapX, int mapY, float speed, int size, int decay, String ID, String CorrespID, int[] marks, GraphicsHandler graphicsHandler) {
        this.content = content;
        pos = new Coordinate(mapX, mapY);
        steps = (int) (speed * 120);
        drawer = new DialogueAnimator(pos, steps, decay, marks, CorrespID, graphicsHandler);
        this.size = size;
        this.ID = ID;
    }

    private int size;
    private int steps;
    private TextDrawer drawer;
    private String[] content;
    private Coordinate pos;
    private String ID;

    public void setContent(String[] content) {
        this.content = content;
    }

    public void setDrawer(TextDrawer drawer) {
        this.drawer = drawer;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPos(Coordinate pos) {
        this.pos = pos;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public Animation getAnimation() {
        return null;
    }

    @Override
    public void draw(Graphics g, int zoom) {

        g.setFont(g.getFont().deriveFont((float) (size * zoom)));
        drawer.draw(g, content, zoom, size);


    }

    public void setSteps(int steps) {
        this.steps = steps;

    }

    @Override
    public String getID() {
        return ID;
    }

    @Override
    public Coordinate getPos() {
        return pos;
    }
}

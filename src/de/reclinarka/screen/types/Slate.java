package de.reclinarka.screen.types;

import de.reclinarka.objects.Drawable;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by reclinarka on 14.12.2016.
 */
public class Slate extends JPanel {

    public Slate(){
        repaint();
    }

    private ArrayList<Drawable> content = new ArrayList<Drawable>();

    public ArrayList<Drawable> getContent() {
        return content;
    }

    public void addDrawable(Drawable e){
        content.add(e);
    }

    protected void paintComponent(Graphics g) {
        content.forEach((f) -> f.draw(g));
    }
}

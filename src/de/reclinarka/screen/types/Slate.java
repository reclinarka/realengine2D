package de.reclinarka.screen.types;

import de.reclinarka.objects.Drawable;
import de.reclinarka.processing.GraphicsHandler;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

/**
 * Created by reclinarka on 14.12.2016.
 */
public class Slate extends JPanel {

    public Slate(ArrayList<Drawable> e) {
        content = e;
        repaint();
    }

    private ArrayList<Drawable> content;

    protected void paintComponent(Graphics g) {
        g.drawImage(GraphicsHandler.BackGrounds.get(0) ,0 ,0 ,GraphicsHandler.BackGrounds.get(0).getWidth(),GraphicsHandler.BackGrounds.get(0).getHeight() ,null);

        content.forEach((f) -> f.draw(g));

    }
}

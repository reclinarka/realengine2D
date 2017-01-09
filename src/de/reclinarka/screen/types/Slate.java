package de.reclinarka.screen.types;

import de.reclinarka.graphics.GraphicsHandler;
import de.reclinarka.objects.Drawable;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by reclinarka on 14.12.2016.
 */
public class Slate extends JPanel {

    private GraphicsHandler graphicsHandler;

    public Slate(GraphicsHandler graphicsHandler) {
        this.graphicsHandler = graphicsHandler;
        repaint();
    }



    protected void paintComponent(Graphics g) {

        graphicsHandler.getCurrentMap().paintComponents(g, graphicsHandler.getZoom());



    }
}

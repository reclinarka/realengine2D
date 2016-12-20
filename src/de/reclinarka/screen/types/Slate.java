package de.reclinarka.screen.types;

import de.reclinarka.objects.Drawable;
import de.reclinarka.objects.background.BackGround;
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

    public Slate(ArrayList<Drawable> e, ArrayList<BackGround> f) {
        content = e;
        bg = f;
        repaint();
    }

    private ArrayList<BackGround> bg;

    private ArrayList<Drawable> content;

    protected void paintComponent(Graphics g) {

        bg.forEach((f) -> f.draw(g));

        content.forEach((f) -> f.draw(g));

    }
}

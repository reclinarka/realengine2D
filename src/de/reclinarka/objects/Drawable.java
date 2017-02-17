package de.reclinarka.objects;

import de.reclinarka.objects.animation.Animation;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by reclinarka on 14.12.2016.
 */
public interface Drawable {
    void draw(Graphics g, int zoom);
    void update(ArrayList<Drawable> Content);

    Coordinate getPos();
    int getWidth();
    int getHeight();
    String getID();
    Animation getAnimation();

    //int getWidth();

}

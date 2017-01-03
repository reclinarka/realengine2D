package de.reclinarka.objects;

import de.reclinarka.objects.animation.Animation;

import java.awt.*;

/**
 * Created by reclinarka on 14.12.2016.
 */
public interface Drawable {
    void draw(Graphics g, int zoom);

    Coordinate getPos();
    String getID();
    Animation getAnimation();

    //int getWidth();

}

package de.reclinarka.objects;

import java.awt.*;

/**
 * Created by reclinarka on 14.12.2016.
 */
public interface Drawable {
    void draw(Graphics g);

    Coordinate getPos();

    //int getWidth();

}

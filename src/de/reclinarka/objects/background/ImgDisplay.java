package de.reclinarka.objects.background;

import de.reclinarka.objects.Coordinate;
import de.reclinarka.objects.Drawable;
import de.reclinarka.objects.animation.Animation;
import de.reclinarka.objects.animation.SelectiveAnimation;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by reclinarka on 29.12.2016.
 */
public class ImgDisplay implements Drawable{

    public ImgDisplay(String ID, int x, int y, int height, int width, String inSource){
        animated = false;
        this.ID = ID;
        pos = new Coordinate(x,y);
        this.height = height;
        this.width = width;
        init(inSource);
    }

    public ImgDisplay(String ID, int x, int y, int height, int width, String[] inSource, int speed){
        this.ID = ID;
        pos = new Coordinate(x,y);
        this.height = height;
        this.width = width;
        animated = true;
        animation = new Animation(inSource, speed);
    }

    public ImgDisplay(String ID, int x, int y, int height, int width, String[] inSource){
        this.ID = ID;
        pos = new Coordinate(x,y);
        this.height = height;
        this.width = width;
        animated = true;
        animation = new SelectiveAnimation(inSource);
    }

    private void init(String inSource){
        try {
            texture = ImageIO.read(getClass().getResourceAsStream(inSource));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Animation animation;
    private boolean animated;
    private String ID;
    private BufferedImage texture;

    private int height;
    private int width;
    private Coordinate pos;

    @Override
    public void draw(Graphics g, int zoom) {
        if(animated){
            animation.draw(g, pos.getX() , pos.getY() , width * zoom, height * zoom);
        }
        g.drawImage(texture, pos.getX() , pos.getY() , width * zoom, height * zoom,null);
    }

    @Override
    public Coordinate getPos() {
        return pos;
    }
}

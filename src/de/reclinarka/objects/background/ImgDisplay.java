package de.reclinarka.objects.background;

import de.reclinarka.objects.Coordinate;
import de.reclinarka.objects.Drawable;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by reclinarka on 29.12.2016.
 */
public class ImgDisplay implements Drawable{

    public ImgDisplay(String ID, int x, int y, int height, int width){
        this.ID = ID;
        pos = new Coordinate(x,y);
        this.height = height;
        this.width = width;
        init();
    }

    private void init(){
        try {
            texture = ImageIO.read(getClass().getResourceAsStream("/de/reclinarka/resources/Sans.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String ID;
    private BufferedImage texture;

    private int height;
    private int width;
    private Coordinate pos;

    @Override
    public void draw(Graphics g, int zoom) {
        g.drawImage(texture, pos.getX() , pos.getY() , width * zoom, height * zoom,null);
    }

    @Override
    public Coordinate getPos() {
        return pos;
    }
}

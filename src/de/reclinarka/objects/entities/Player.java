package de.reclinarka.objects.entities;

import de.reclinarka.objects.Coordinate;
import de.reclinarka.objects.Drawable;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.lang.management.BufferPoolMXBean;

/**
 * Created by reclinarka on 29.12.2016.
 */
public class Player implements Drawable {

    public Player(int mapX, int mapY){
        pos = new Coordinate( mapX, mapY);
    }



    private void update(){
        try {
            texture = ImageIO.read(getClass().getResourceAsStream("/de/reclinarka/resources/Player.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int width = 16;

    private int height = 32;

    BufferedImage texture;

    private Coordinate pos;

    @Override
    public void draw(Graphics g) {
        g.drawImage( texture,pos.getX(), pos.getY(), width, height,null);
    }

    @Override
    public Coordinate getPos() {
        return pos;
    }
}

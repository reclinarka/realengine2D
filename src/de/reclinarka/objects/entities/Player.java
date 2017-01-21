package de.reclinarka.objects.entities;

import de.reclinarka.objects.Coordinate;
import de.reclinarka.objects.Drawable;
import de.reclinarka.objects.animation.Animation;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by reclinarka on 29.12.2016.
 */
public class Player implements Drawable {

    public Player(int mapX, int mapY, String ID){
        pos = new Coordinate( mapX, mapY);
        alive = false;
        this.ID = ID;
        textureUpdate();
    }

    private boolean alive;

    private void textureUpdate(){
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

    private String ID;

    @Override
    public void update(){

    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public Animation getAnimation() {
        return null;
    }

    @Override
    public String getID() {
        return ID;
    }

    @Override
    public void draw(Graphics g, int zoom) {
        g.drawImage( texture,pos.getX(), pos.getY(), width * zoom, height * zoom,null);
    }

    @Override
    public Coordinate getPos() {
        return pos;
    }
}

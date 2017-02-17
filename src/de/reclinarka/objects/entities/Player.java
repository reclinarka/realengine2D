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

    private float velocity = -4;

    private int height = 32;

    BufferedImage texture;

    private Coordinate pos;

    private String ID;

    public float getVelocity() {
        return velocity;
    }

    public void setVelocity(float velocity) {
        this.velocity = velocity;
    }

    @Override
    public void update(){
        pos.setMapY( pos.getMapY() + (int) ( velocity ) );

        if(velocity < 3) {

            velocity += 0.07;
        }

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
        g.drawString("x", pos.getX(),pos.getY());
        Font tmp = new Font(g.getFont().getName(),g.getFont().getStyle(),g.getFont().getSize());
        g.setFont(new Font(null,g.getFont().getStyle(),10 * zoom));
        g.drawImage( texture, pos.getX(), pos.getY(), width * zoom, height * zoom,null);
        g.drawString("("+ pos.getMapX() + "|" + pos.getMapY() + ")",pos.getX(), pos.getY() - 10 * zoom );
        //System.out.println(getPos().getX() + ", " + getPos().getY());
        g.setFont(tmp);
    }

    @Override
    public Coordinate getPos() {
        return pos;
    }
}

package de.reclinarka.player;

import de.reclinarka.objects.Coordinate;
import de.reclinarka.objects.Drawable;
import de.reclinarka.objects.Hitbox;
import de.reclinarka.processing.GraphicsHandler;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static de.reclinarka.Main.zoom;


/**
 * Created by reclinarka on 18.12.2016.
 */
public class Player extends Thread implements Drawable{

    private int width = 16;

    private int height = 32;

    private int sizeModifier = 2;

    public void run(){
        while (true){

            if (pos.getMapX() + (this.width * this.sizeModifier * zoom) > GraphicsHandler.Maps.get(0).getWidth()){
                pos.setMapX(GraphicsHandler.Maps.get(0).getWidth() - (this.width * this.sizeModifier * zoom));
            }   else if(pos.getMapX() < 0){
                pos.setMapX(0);
            }

            try {
                TimeUnit.MILLISECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public Player(int mapX, int mapY){
        pos = new Coordinate(mapX,mapY);
        hitbox = new Hitbox(mapX,mapY,( this.width * this.sizeModifier ),( this.height * this.sizeModifier ));
        init();
    }

    public void init(){
        try {
            texture = ImageIO.read(getClass().getResourceAsStream("/de/reclinarka/resources/Player.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private BufferedImage texture;

    protected static Hitbox hitbox;

    public static Coordinate pos;

    public Coordinate getPos() {
        return pos;
    }

    public Hitbox getHitbox() {
        return hitbox;
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(texture,pos.getX(),pos.getY(),(16 * 2 )*zoom,(32 * 2 )*zoom,null);
    }
}

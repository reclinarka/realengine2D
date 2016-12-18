package de.reclinarka.player;

import de.reclinarka.objects.Coordinate;
import de.reclinarka.objects.Drawable;
import de.reclinarka.objects.Hitbox;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;


/**
 * Created by reclinarka on 18.12.2016.
 */
public class Player implements Drawable{
    public Player(int mapX, int mapY){
        pos = new Coordinate(mapX,mapY);
        hitbox = new Hitbox(mapX,mapY,16,32);
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
        g.drawImage(texture,pos.getX(),pos.getY(),16,32,null);
    }
}

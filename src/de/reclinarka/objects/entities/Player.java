package de.reclinarka.objects.entities;

import com.sun.org.apache.regexp.internal.RE;
import de.reclinarka.objects.Coordinate;
import de.reclinarka.objects.Drawable;
import de.reclinarka.objects.animation.Animation;
import de.reclinarka.util.CollisionChecker;
import org.w3c.dom.css.Rect;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

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
    public void update(ArrayList<Drawable> Content){
        Coordinate newPos = calcPos();
        Coordinate updatePos = check(Content,newPos);
        if (updatePos == null){
            pos = newPos;
            checking = false;
            return;
        }
        checking = false;
        velocity = -3;
        pos = updatePos;



    }

    private boolean checking = false;
    private Drawable colliding;

    private Coordinate check(ArrayList<Drawable> Content, Coordinate newPos){
        Content.forEach( (f) -> colliding(f,newPos) );

        if(checking == false)return null;
        return CollisionChecker.newPos(colliding, pos, height, width);
    }

    private void colliding(Drawable obj1, Coordinate newPos ){
        if(obj1.getPos() == pos) return;
        if(new Rectangle(obj1.getPos().getMapX(), obj1.getPos().getMapY(), obj1.getWidth(), obj1.getHeight() ).intersects(
                newPos.getMapX(), newPos.getMapY(), width, height)){
                checking = true;
                colliding = obj1;
        }
    }

    private Coordinate calcPos(){

        if(velocity < 3) {
            if(velocity < 1 && velocity > -1){
                velocity += 0.4;
            } else {
                velocity += 0.07;
            }
        }
        return new Coordinate(pos.getMapX(),pos.getMapY() + (int) ( velocity ));
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
        g.drawString("(" + velocity + ")", pos.getX(), pos.getY() - 3 * zoom);
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

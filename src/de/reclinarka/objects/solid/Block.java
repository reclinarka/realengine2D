package de.reclinarka.objects.solid;

import de.reclinarka.objects.Coordinate;
import de.reclinarka.objects.Drawable;
import de.reclinarka.objects.Hitbox;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Block implements Drawable {

    public Block(int x, int y, int mapX, int mapY){
        pos = new Coordinate(x,y,mapX,mapY);
        hitbox = new Hitbox(mapX,mapY,width,height);
        Block_ID = "default";
        update();
    }

    public Block() {
    }

    protected void update(){
        try {
            texture = ImageIO.read(getClass().getResourceAsStream("/de/reclinarka/objects/resources/Block_" + Block_ID + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private BufferedImage texture;

    private Coordinate pos;

    private int width = 16;

    private int height = 16;

    private String Block_ID = "default";

    private Hitbox hitbox;

    //Getter

    public String getBlock_ID() {
        return Block_ID;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Coordinate getPos() {
        return pos;
    }

    //Setter

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setPos(Coordinate pos) {
        this.pos = pos;
    }

    public void setHitbox(Hitbox hitbox) {
        this.hitbox = hitbox;
    }

    public void setBlock_ID(String block_ID) {
        Block_ID = block_ID;
    }

    @Override
    public void draw(Graphics g){
        g.drawImage(texture,pos.getX(),pos.getY(),width,height,null);
    }




}

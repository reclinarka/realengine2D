package de.reclinarka.objects.background;

import de.reclinarka.displayed.maps.Map;
import de.reclinarka.objects.Coordinate;
import de.reclinarka.objects.background.layer.Layer;
import de.reclinarka.processing.GraphicsHandler;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by reclinarka on 17.12.2016.
 */
public class BackGround {

    public BackGround(String path, Layer layer, int mapX, int mapY){
        try {
            texture = ImageIO.read(getClass().getResourceAsStream(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.layer = layer;
        Pos = new Coordinate(mapX,mapY);
    }

    private Layer layer;

    private BufferedImage texture;

    private Coordinate Pos;

    public void transform(Coordinate e, int ScreenX, int ScreenY){
        e.setX( (int) (e.getMapX() - (ScreenX * layer.getModifier()) ) );
        e.setY( (int) (e.getMapY() - (ScreenY * layer.getModifier()) ) );
    }

    //Getter
    public BufferedImage getTexture() {
        return texture;
    }

    public Coordinate getPos() {
        return Pos;
    }

    public Layer getLayer() {
        return layer;
    }

    //Setter
    public void setTexture(BufferedImage texture) {
        this.texture = texture;
    }

    public void setPos(Coordinate pos) {
        Pos = pos;
    }



    public void draw(Graphics g){
        g.drawImage(getTexture() ,getPos().getX() ,getPos().getY(), getTexture().getWidth()/2 , getTexture().getHeight()/2 ,null);
    }
}

package de.reclinarka.objects.background;

import de.reclinarka.displayed.maps.Map;
import de.reclinarka.objects.Coordinate;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by reclinarka on 17.12.2016.
 */
public class BackGround {

    public BackGround(String path, float modifier, int mapX, int mapY){
        try {
            texture = ImageIO.read(getClass().getResourceAsStream(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.modifier = modifier;
        Pos = new Coordinate(mapX,mapY);
    }

    private BufferedImage texture;

    private float modifier;

    private Coordinate Pos;

    public void transform(Coordinate e, int ScreenX, int ScreenY){
        e.setX( (int) (e.getMapX() - (ScreenX * modifier) ) );
        e.setY( (int) (e.getMapY() - (ScreenY * modifier) ) );
    }

    //Getter
    public BufferedImage getTexture() {
        return texture;
    }

    public float getModifier() {
        return modifier;
    }

    public Coordinate getPos() {
        return Pos;
    }

    //Setter
    public void setTexture(BufferedImage texture) {
        this.texture = texture;
    }

    public void setModifier(float modifier) {
        this.modifier = modifier;
    }

    public void setPos(Coordinate pos) {
        Pos = pos;
    }
}

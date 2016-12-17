package de.reclinarka.objects.background;

import de.reclinarka.objects.Coordinate;

import java.awt.image.BufferedImage;

/**
 * Created by reclinarka on 17.12.2016.
 */
public class BackGround {
    private BufferedImage texture;

    private float modifier;

    private Coordinate Pos;

    public void transform(){

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

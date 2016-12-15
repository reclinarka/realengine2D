package de.reclinarka.objects;

/**
 * Created by reclinarka on 15.12.2016.
 */
public class Hitbox {

    public Hitbox(int mapX, int mapY){
        this.mapX = mapX;
        this.mapY = mapX;
    }

    private int mapX;

    private int mapY;

    private int centreX;

    private int centreY;

    private int width;

    private int height;

    //Setter

    public void setMapX(int mapX) {
        this.mapX = mapX;
        this.centreX = mapX+(width/2);
    }

    public void setMapY(int mapY) {
        this.mapY = mapY;
        this.centreY = mapY+(height/2);
    }
}

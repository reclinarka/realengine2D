package de.reclinarka.objects;

/**
 * Created by reclinarka on 15.12.2016.
 */
public class Hitbox {

    public Hitbox(int mapX, int mapY, int width, int height){
        this.mapX = mapX;
        this.mapY = mapX;
        this.width = width;
        this.height = height;
        this.centreX = mapX+(width/2);
        this.centreY = mapY+(height/2);
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

    public void setCentreX(int centreX) {
        this.centreX = centreX;
        this.mapX = centreX-(width/2);
    }

    public void setCentreY(int centreY) {
        this.centreY = centreY;
        this.mapY = centreY-(height/2);
    }

    public void setWidth(int width) {
        this.width = width;
        this.centreX = mapX+(width/2);
    }

    public void setHeight(int height) {
        this.height = height;
        this.centreY = mapY+(height/2);
    }
}

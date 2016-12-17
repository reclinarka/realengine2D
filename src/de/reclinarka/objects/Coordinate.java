package de.reclinarka.objects;

/**
 * Created by reclinarka on 15.12.2016.
 */
public class Coordinate {

    public Coordinate(int x, int y, int mapX, int mapY){
        this.x = x;
        this.y = y;
        this.mapX = mapX;
        this.mapY = mapY;
    }

    private int x;

    private int y;

    private int mapX;

    private int mapY;

    //Getter

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getMapX() {
        return mapX;
    }

    public int getMapY() {
        return mapY;
    }

    //Setter

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setMapX(int mapX) {
        this.mapX = mapX;
    }

    public void setMapY(int mapY) {
        this.mapY = mapY;
    }
}

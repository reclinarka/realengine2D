package de.reclinarka.displayed.maps;

import de.reclinarka.displayed.translator;
import de.reclinarka.objects.Coordinate;
import de.reclinarka.objects.Drawable;
import de.reclinarka.processing.GraphicsHandler;
import de.reclinarka.screen.*;
import de.reclinarka.screen.Window;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by reclinarka on 17.12.2016.
 */
public class Map implements translator {

    public Map(){

    }

    protected int ScreenX = 0;

    protected int ScreenY = 0;

    public void translate(ArrayList<Drawable> inArray){
        inArray.forEach((f) -> change(f));
    }

    private void change(Drawable e){
        changeX(e.getPos());
        changeY(e.getPos());
    }

    private void changeX(Coordinate inPos){
        inPos.setX(inPos.getX() + ScreenX);
    }

    private void changeY(Coordinate inPos){
        inPos.setY(inPos.getY() + ScreenY);
    }

    //Getter
    public int getScreenX() {
        return ScreenX;
    }

    public int getScreenY() {
        return ScreenY;
    }

    //Setter
    public void setScreenX(int screenX) {
        ScreenX = screenX;
    }

    public void setScreenY(int screenY) {
        ScreenY = screenY;
    }
}

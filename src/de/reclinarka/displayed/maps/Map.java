package de.reclinarka.displayed.maps;

import de.reclinarka.displayed.translator;
import de.reclinarka.objects.Coordinate;
import de.reclinarka.objects.Drawable;
import de.reclinarka.player.Player;
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

    protected int width = 8000;

    protected int height = 2000;

    public void translate(ArrayList<Drawable> inArray){
        inArray.forEach((f) -> change(f));
    }

    private void change(Drawable e){
        changeX(e.getPos());
        changeY(e.getPos());
    }

    private void changeX(Coordinate inPos){
        inPos.setX(inPos.getMapX() - ScreenX);
    }

    private void changeY(Coordinate inPos){
        inPos.setY(inPos.getMapY() - ScreenY);
    }

    public void AlignToPlayer(int width, int height){
        int ScreenX = ( Player.pos.getMapX() - width/2 );
        int ScreenY = ( Player.pos.getMapY() - height/2 );

        if(ScreenX < 0 ){
            this.ScreenX = 0;
        } else if( ScreenX > this.width - width) {
            this.ScreenX = this.width - width;
        } else {
            this.ScreenX = ScreenX;
        }

        if(ScreenY < 0 ){
            this.ScreenY = 0;
        } else if( ScreenY > this.height - height) {
            this.ScreenY = this.height - height;
        } else {
            this.ScreenY = ScreenY;
        }

    }

    //Getter
    public int getScreenX() {
        return ScreenX;
    }

    public int getScreenY() {
        return ScreenY;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    //Setter
    public void setScreenX(int screenX) {
        ScreenX = screenX;
    }

    public void setScreenY(int screenY) {
        ScreenY = screenY;
    }
}

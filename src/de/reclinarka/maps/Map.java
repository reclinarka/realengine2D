package de.reclinarka.maps;

import de.reclinarka.Main;
import de.reclinarka.objects.Coordinate;
import de.reclinarka.objects.Drawable;
import de.reclinarka.objects.entities.Player;
import javafx.scene.media.Media;
import sun.audio.AudioStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by reclinarka on 29.12.2016.
 */
public class Map {

    public Map(){
        init();

    }

    private void init(){
        Sound = new Media(getClass().getResource("/de/reclinarka/resources/Sound.mp3").toString());
    }
    private Media Sound;
    private ArrayList<Drawable> Content = new ArrayList<Drawable>();
    private int ScreenX = 0;
    private int ScreenY = 0;
    private ArrayList<Player> Players = new ArrayList<Player>();

    public void alignObjects(int zoom){
        Content.forEach( (f) -> alignObject(f, zoom) );
        Players.forEach( (f) -> alignObject(f, zoom) );
    }

    private void alignObject(Drawable obj, int zoom){
        Coordinate pos = obj.getPos();
        pos.setX( (pos.getMapX() - ScreenX) * zoom );
        pos.setY( (pos.getMapY() - ScreenY) * zoom );
    }

    public Media getSound() {
        return Sound;
    }

    public ArrayList<Player> getPlayers() {
        return Players;
    }

    public int getScreenX() {
        return ScreenX;
    }

    public int getScreenY() {
        return ScreenY;
    }

    public void updateComponents(){

    }

    public void paintComponents(Graphics g, int zoom){
        getContent().forEach((f) -> f.draw(g, zoom ));
    }

    public ArrayList<Drawable> getContent() {
        return Content;
    }
}

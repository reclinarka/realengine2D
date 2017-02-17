package de.reclinarka.maps;

import de.reclinarka.Main;
import de.reclinarka.graphics.GraphicsHandler;
import de.reclinarka.objects.Coordinate;
import de.reclinarka.objects.Drawable;
import de.reclinarka.objects.entities.Player;
import de.reclinarka.objects.solid.blocks.Brick;
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

    public Map(int mapX, int mapY, GraphicsHandler graphicsHandler){
        init();
        Player P1 = new Player(mapX, mapY, "Player 1");
        this.graphicsHandler = graphicsHandler;
        Content.add(P1);
        Players.add(P1);
    }

    private void init(){
        Sound = new Media(getClass().getResource("/de/reclinarka/resources/Sound.mp3").toString());
    }
    private Media Sound;
    private GraphicsHandler graphicsHandler;
    private ArrayList<Drawable> Content = new ArrayList<Drawable>();
    private int ScreenX = 0;
    private int ScreenY = 0;
    private ArrayList<Player> Players = new ArrayList<Player>();

    public void alignObjects(int zoom){
        ScreenX =  Players.get(0).getPos().getMapX() * zoom + Players.get(0).getHeight() -  ( graphicsHandler.getFrame().getWidth() / 2 ) ;
        ScreenY =  Players.get(0).getPos().getMapY() * zoom + Players.get(0).getWidth() - ( graphicsHandler.getFrame().getHeight() / 2 ) ;
        Content.forEach( (f) -> alignObject(f, zoom) );
    }

    private void alignObject(Drawable obj, int zoom){
        Coordinate pos = obj.getPos();
        pos.setX( (pos.getMapX() * zoom) - ScreenX   );
        pos.setY( (pos.getMapY() * zoom) - ScreenY   );
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
        getContent().forEach((f) -> f.update());

    }

    public Drawable testCollision(){
        return null;
    }

    public void paintComponents(Graphics g, int zoom){
        getContent().forEach((f) -> f.draw(g, zoom ));
    }

    public ArrayList<Drawable> getContent() {
        return Content;
    }
}

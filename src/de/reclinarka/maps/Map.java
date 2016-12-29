package de.reclinarka.maps;

import de.reclinarka.Main;
import de.reclinarka.objects.Drawable;
import de.reclinarka.objects.entities.Player;
import javafx.scene.media.Media;
import sun.audio.AudioStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
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
    private int ScreenX;
    private int ScreenY;
    private ArrayList<Player> Players = new ArrayList<Player>();

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

    public ArrayList<Drawable> getContent() {
        return Content;
    }
}

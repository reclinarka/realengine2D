package de.reclinarka.maps;

import de.reclinarka.objects.Drawable;
import de.reclinarka.objects.entities.Player;

import java.util.ArrayList;

/**
 * Created by reclinarka on 29.12.2016.
 */
public class Map {

    public Map(){
    }

    private ArrayList<Drawable> Content = new ArrayList<Drawable>();
    private int ScreenX;
    private int ScreenY;
    private ArrayList<Player> Players = new ArrayList<Player>();

    public ArrayList<Drawable> getContent() {
        return Content;
    }
}

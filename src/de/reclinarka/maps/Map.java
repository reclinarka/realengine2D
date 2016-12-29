package de.reclinarka.maps;

import de.reclinarka.objects.Drawable;
import de.reclinarka.objects.entities.Player;

import java.util.ArrayList;

/**
 * Created by reclinarka on 29.12.2016.
 */
public class Map {

    public Map(){
        Content = new ArrayList<Drawable>();
    }

    protected ArrayList<Drawable> Content;
    private int ScreenX;
    private int ScreenY;
    private ArrayList<Player>

    public ArrayList<Drawable> getContent() {
        return Content;
    }
}

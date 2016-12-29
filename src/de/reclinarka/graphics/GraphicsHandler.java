package de.reclinarka.graphics;

import de.reclinarka.maps.Map;

import java.util.ArrayList;

/**
 * Created by reclinarka on 29.12.2016.
 */
public class GraphicsHandler extends Thread{

    private int selected;

    private ArrayList<Map> Maps = new ArrayList<Map>();

    @Override
    public void run() {

    }

    public Map getCurrentMap(){
        return Maps.get(selected);
    }

    public ArrayList<Map> getMaps() {
        return Maps;
    }

    public int getSelected() {
        return selected;
    }

    public void select(int selected){
        this.selected = selected;
    }
}

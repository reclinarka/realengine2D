package de.reclinarka.graphics;

import de.reclinarka.maps.Map;
import de.reclinarka.screen.Window;
import de.reclinarka.screen.types.Slate;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Created by reclinarka on 29.12.2016.
 */
public class GraphicsHandler extends Thread{

    private int selected;

    private ArrayList<Map> Maps = new ArrayList<Map>();

    @Override
    public void run() {
        new Window(800,800,"game", new Slate(getCurrentMap().getContent()));

        while (true){



            //Sets framerate
            try {
                TimeUnit.MILLISECONDS.sleep(1000/120);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

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

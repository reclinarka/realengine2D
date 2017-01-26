package de.reclinarka.graphics;

import de.reclinarka.maps.Map;
import de.reclinarka.screen.Window;
import de.reclinarka.screen.types.Slate;
import javafx.scene.media.MediaPlayer;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Created by reclinarka on 29.12.2016.
 */
public class GraphicsHandler extends Thread{

    public GraphicsHandler(String ID){
        this.ID = ID;

    }

    private String ID;

    private Window frame;

    private int zoom = 5;

    private GraphicsHandler self;

    private int selected = 0;

    private ArrayList<Map> Maps = new ArrayList<>();

    @Override
    public void run() {
        frame = new Window(800,800, ID, new Slate(self),self);
        //MediaPlayer mp = new MediaPlayer(getCurrentMap().getSound());
        //mp.play();
        //mp.setVolume(0.1);

        while (true){
            //if(zoom <= 0) zoom = 1;
            //if (zoom >6) zoom = 1;
            getCurrentMap().alignObjects(zoom);
            frame.repaint();

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

    public void setSelf(GraphicsHandler self) {
        this.self = self;
    }

    public ArrayList<Map> getMaps() {
        return Maps;
    }

    public int getSelected() {
        return selected;
    }

    public int getZoom() {
        return zoom;
    }

    public Window getFrame() {
        return frame;
    }

    public String getID() {
        return ID;
    }

    public void setZoom(int zoom) {
        this.zoom = zoom;
    }

    public void select(int selected){
        this.selected = selected;
    }
}

package de.reclinarka.util;

import de.reclinarka.displayed.maps.Map;
import de.reclinarka.player.Player;
import de.reclinarka.processing.GraphicsHandler;

import java.util.concurrent.TimeUnit;

/**
 * Created by reclinarka on 17.12.2016.
 */
public class Holder extends Thread{
    public Holder(){

    }

    public void run(){
        while(OnClick.test){
            Player.pos.setMapX(Player.pos.getMapX() + 4);
            try {
                TimeUnit.MILLISECONDS.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

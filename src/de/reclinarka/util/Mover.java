package de.reclinarka.util;

import de.reclinarka.graphics.GraphicsHandler;

import java.util.concurrent.TimeUnit;

/**
 * Created by reclinarka on 21.02.2017.
 */
public class Mover extends Thread{

    public Mover(int speed, GraphicsHandler graphicsHandler){
        this.speed = speed;
        this.graphicsHandler = graphicsHandler;

    }

    private GraphicsHandler graphicsHandler;

    private int speed;
    public boolean active = false;

    @Override
    public void run(){
        while (true){

            if(active) {
                graphicsHandler.getCurrentMap().getPlayers().get(0).getPos().setMapX(
                        graphicsHandler.getCurrentMap().getPlayers().get(0).getPos().getMapX() +
                                speed
                );
            }




            try {
                TimeUnit.MILLISECONDS.sleep(1000/120);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

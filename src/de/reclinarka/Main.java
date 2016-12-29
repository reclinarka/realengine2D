package de.reclinarka;


import de.reclinarka.graphics.GraphicsHandler;
import de.reclinarka.maps.Map;
import de.reclinarka.screen.Window;
import de.reclinarka.screen.types.Slate;

public class Main extends Thread{

    public static void main(String[] args) {

        GraphicsHandler graphicsHandler = new GraphicsHandler();
        graphicsHandler.getMaps().add(new Map());
        graphicsHandler.start();



    }



}

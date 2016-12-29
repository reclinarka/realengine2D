package de.reclinarka;


import de.reclinarka.graphics.GraphicsHandler;
import de.reclinarka.maps.Map;
import de.reclinarka.screen.Window;
import de.reclinarka.screen.types.Slate;
import de.reclinarka.util.JavaFXInitializer;
import de.reclinarka.util.Threader;
import javafx.application.Application;
import javafx.stage.Stage;

import static com.sun.javafx.application.PlatformImpl.startup;

public class Main extends Thread{



    public static void main(String[] args) {
        Threader t = new Threader();
        t.start();

        GraphicsHandler graphicsHandler = new GraphicsHandler();
        graphicsHandler.getMaps().add(new Map());
        graphicsHandler.start();



    }



}


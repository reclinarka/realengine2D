package de.reclinarka;


import de.reclinarka.graphics.GraphicsHandler;
import de.reclinarka.maps.Map;
import de.reclinarka.objects.background.ImgDisplay;
import de.reclinarka.objects.text.TextField;
import de.reclinarka.screen.Window;
import de.reclinarka.screen.types.Slate;
import de.reclinarka.util.JavaFXInitializer;
import de.reclinarka.util.Threader;
import javafx.application.Application;
import javafx.stage.Stage;

import static com.sun.javafx.application.PlatformImpl.startup;

public class Main extends Thread{





    public static void main(String[] args){
        Threader t = new Threader();
        t.start();
        System.out.println("MY_NAME".length());
        int modifier = 2;
        GraphicsHandler graphicsHandler = new GraphicsHandler();
        graphicsHandler.setSelf(graphicsHandler);
        graphicsHandler.getMaps().add(new Map());
        graphicsHandler.start();
        try {
            graphicsHandler.getCurrentMap().getContent().add(new ImgDisplay("sans", 100, 100, 38 * modifier, 32 * modifier, new String[]{
                    "/de/reclinarka/resources/Sans_0.png", "/de/reclinarka/resources/Sans_1.png"
            }));
        } catch(Exception e){
            e.printStackTrace();
        }
        graphicsHandler.getCurrentMap().getContent().add(new TextField(
               new String[] {"Hey...     ","my name is","Sans.     ","Let's start!"},90,180, (float) 0.07, 10,60, "sans_dialog"
        ));







    }



}


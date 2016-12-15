package de.reclinarka.processing;

import de.reclinarka.objects.Drawable;
import de.reclinarka.screen.Window;
import de.reclinarka.screen.types.Slate;

import java.util.ArrayList;

/**
 * Created by reclinarka on 15.12.2016.
 */
public class GraphicsHandler {

    public static ArrayList<Drawable> Content = new ArrayList<Drawable>();
    public static void start(){
        Slate game = new Slate();
        new Window(800,800,"Game",null);
        while (true) {

        }
    }
}

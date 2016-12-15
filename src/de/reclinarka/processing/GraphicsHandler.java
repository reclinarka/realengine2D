package de.reclinarka.processing;

import de.reclinarka.objects.Drawable;
import de.reclinarka.screen.Window;
import de.reclinarka.screen.types.Slate;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Created by reclinarka on 15.12.2016.
 */
public class GraphicsHandler extends Thread{


    public static ArrayList<Drawable> Content = new ArrayList<Drawable>();
    @Override
    public void run(){
        Slate game = new Slate(Content);

        Window frame = new Window(800,800,"Game",game);
        while (true) {
            try {
                TimeUnit.MILLISECONDS.sleep(1000/20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //Content.forEach((f) -> mover(frame.getContentPane(),f));
            frame.repaint();
        }
    }

    private static void mover(Container e, Drawable f){
        if(f.getPos().getX() > e.getWidth())
            f.getPos().setX(0-f.getWidth());
        f.getPos().setX(f.getPos().getX() + 2);
        if(f.getPos().getY() > e.getHeight())
            f.getPos().setY(0-f.getWidth());
        f.getPos().setY(f.getPos().getX() + 2);
    }
}

package de.reclinarka;


import de.reclinarka.objects.Drawable;
import de.reclinarka.objects.solid.Block;
import de.reclinarka.processing.GraphicsHandler;
import de.reclinarka.screen.Window;
import de.reclinarka.screen.types.Slate;

import javax.swing.*;

public class Main extends Thread{

    public static void main(String[] args) {
        new Thread(GraphicsHandler.start());
        while (true) {

        }

    }

    private static void mover(JPanel e, Drawable f){
        if(f.getPos().getX() > e.getWidth())
            f.getPos().setX(0-f.getWidth());
        f.getPos().setX(f.getPos().getX() + 2);
        if(f.getPos().getY() > e.getHeight())
            f.getPos().setY(0-f.getWidth());
        f.getPos().setY(f.getPos().getX() + 2);
    }

}

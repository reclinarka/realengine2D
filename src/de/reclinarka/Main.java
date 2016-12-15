package de.reclinarka;


import de.reclinarka.objects.Drawable;
import de.reclinarka.objects.solid.Block;
import de.reclinarka.objects.solid.blocks.Brick;
import de.reclinarka.processing.GraphicsHandler;
import de.reclinarka.screen.Window;
import de.reclinarka.screen.types.Slate;

import javax.swing.*;
import java.beans.EventHandler;
import java.util.EventListener;
import java.util.concurrent.TimeUnit;

public class Main extends Thread{

    public static void main(String[] args) {
        GraphicsHandler graphicsHandler = new GraphicsHandler();
        for(int i = 0; i<20; i++){
            graphicsHandler.Content.add(new Brick(16*i,400,16*i,400));
            GraphicsHandler.count++;
        }
        graphicsHandler.start();


        while (true) {
            try {
                TimeUnit.MILLISECONDS.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("reached");
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

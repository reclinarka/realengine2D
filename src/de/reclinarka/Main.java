package de.reclinarka;


import de.reclinarka.displayed.maps.Map;
import de.reclinarka.objects.Drawable;
import de.reclinarka.objects.background.BackGround;
import de.reclinarka.objects.background.layer.Back;
import de.reclinarka.objects.background.layer.Front;
import de.reclinarka.objects.solid.Block;
import de.reclinarka.objects.solid.blocks.Brick;
import de.reclinarka.player.Player;
import de.reclinarka.processing.GraphicsHandler;
import de.reclinarka.screen.Window;
import de.reclinarka.screen.types.Slate;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.beans.EventHandler;
import java.util.EventListener;
import java.util.concurrent.TimeUnit;

import static de.reclinarka.processing.GraphicsHandler.Maps;
import static de.reclinarka.processing.GraphicsHandler.count;

public class Main extends Thread{

    public static int zoom = 3;

    public static void main(String[] args) {



        GraphicsHandler graphicsHandler = new GraphicsHandler();
        Maps.add(new Map("test"));
        GraphicsHandler.BackGrounds.add(new BackGround("/de/reclinarka/resources/BG2.png", new Back(), 0, -800));
        for(int i = 0; i<200; i++){
            GraphicsHandler.Content.add(new Brick( (16 *zoom )* count , ( GraphicsHandler.Maps.get(0).getHeight() / 2 ) +(32*6)));
            count++;
        }

        graphicsHandler.start();
        GraphicsHandler.BackGrounds.add(new BackGround("/de/reclinarka/resources/cloud_1.png", new Front(), 60, 600));



        while (true) {
            try {
                TimeUnit.MILLISECONDS.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("reached");
            System.out.println(count);
        }

    }

   // private static void mover(JPanel e, Drawable f){
   //     if(f.getPos().getX() > e.getWidth())
   //         f.getPos().setX(0-f.getWidth());
   //     f.getPos().setX(f.getPos().getX() + 2);
   //     if(f.getPos().getY() > e.getHeight())
   //         f.getPos().setY(0-f.getWidth());
   //     f.getPos().setY(f.getPos().getX() + 2);
   // }

}

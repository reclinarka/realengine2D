package de.reclinarka.processing;

import de.reclinarka.objects.Drawable;
import de.reclinarka.screen.Window;
import de.reclinarka.screen.types.Slate;
import de.reclinarka.util.DrawablePrinter;
import de.reclinarka.util.OnClick;
import de.reclinarka.util.xCpmparator;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Created by reclinarka on 15.12.2016.
 */
public class GraphicsHandler extends Thread{

    //temp
    public static int count = 0;

    public static ArrayList<Drawable> Content = new ArrayList<Drawable>();
    @Override
    public void run(){
        BufferedImage img = null;
        try {
            img = ImageIO.read(getClass().getResourceAsStream("/de/reclinarka/objects/resources/game.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Slate game = new Slate(Content);
        Window frame = new Window(800,800,"Game",game);
        frame.setIconImage(img);
        frame.getContentPane().addMouseListener(new OnClick());

        while (true) {
            try {
                TimeUnit.MILLISECONDS.sleep(1000/20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //System.out.println("");
            //System.out.println("before:");
            //System.out.println("");
            //DrawablePrinter.print(Content);
            //Content.sort(new xCpmparator());
            //System.out.println("");
            //System.out.println("after:");
            //System.out.println("");
            //DrawablePrinter.print(Content);
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

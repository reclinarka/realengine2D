package de.reclinarka.processing;

import de.reclinarka.displayed.maps.Map;
import de.reclinarka.objects.Drawable;
import de.reclinarka.objects.background.BackGround;
import de.reclinarka.screen.Window;
import de.reclinarka.screen.types.Slate;
import de.reclinarka.util.OnClick;
import de.reclinarka.util.xCpmparator;

import javax.imageio.ImageIO;
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

    public static ArrayList<Map> Maps = new ArrayList<Map>();

    public static ArrayList<BackGround> BackGrounds = new ArrayList<BackGround>();

    public static ArrayList<Drawable> ContentOut = new ArrayList<Drawable>();
    @Override
    public void run(){

        BufferedImage img = null;
        ArrayList<Drawable> Temp;
        try {
            img = ImageIO.read(getClass().getResourceAsStream("/de/reclinarka/objects/resources/game.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        ContentOut = (ArrayList<Drawable>) Content.clone();
        ContentOut.sort(new xCpmparator());

        Slate game = new Slate(ContentOut);
        Window frame = new Window(800,800,"Game",game);
        frame.setIconImage(img);
        frame.getContentPane().addMouseListener(new OnClick());

        while (true) {
            try {
                TimeUnit.MILLISECONDS.sleep(1000/60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Maps.get(0).AlignToPlayer(frame.getWidth(),frame.getHeight());
            ContentOut = (ArrayList<Drawable>) Content.clone();
            Maps.get(0).translate(ContentOut);
            BackGrounds.get(0).transform(BackGrounds.get(0).getPos(),Maps.get(0).getScreenX(),Maps.get(0).getScreenY());
            ContentOut.sort(new xCpmparator());

            frame.repaint();
        }
    }

    //private static void mover(Container e, Drawable f){
    //    if(f.getPos().getX() > e.getWidth())
    //        f.getPos().setX(0-f.getWidth());
    //    f.getPos().setX(f.getPos().getX() + 2);
    //    if(f.getPos().getY() > e.getHeight())
    //        f.getPos().setY(0-f.getWidth());
    //    f.getPos().setY(f.getPos().getX() + 2);
    //}



}

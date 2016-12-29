package de.reclinarka.util;

import de.reclinarka.objects.solid.blocks.Brick;
import de.reclinarka.player.Player;
import de.reclinarka.processing.GraphicsHandler;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.concurrent.TimeUnit;

import static de.reclinarka.Main.zoom;
import static de.reclinarka.processing.GraphicsHandler.Maps;
import static de.reclinarka.processing.GraphicsHandler.count;

/**
 * Created by reclinarka on 15.12.2016.
 */
public class OnClick implements MouseListener, MouseMotionListener{

    public static boolean test=false;
    private static int lvl = 0;



    @Override
    public void mouseClicked(MouseEvent e) {

        System.out.println(e.getX() + "  " + e.getY());
        System.out.println( (e.getX() + GraphicsHandler.Maps.get(0).getScreenX()) + "  "  + (e.getY() + GraphicsHandler.Maps.get(0).getScreenY()) );
        System.out.println( GraphicsHandler.Maps.get(0).getScreenX() + "  " + GraphicsHandler.Maps.get(0).getScreenY());


        GraphicsHandler.ContentOut.add(new Brick((e.getX() * zoom) + GraphicsHandler.Maps.get(0).getScreenX(), (e.getY() * zoom) + GraphicsHandler.Maps.get(0).getScreenY()));
        //Maps.get(0).setScreenX(Maps.get(0).getScreenX()+4);

        //if(16*count>800-16){
        //    count = 0;
        //    lvl++;
        //}
        //GraphicsHandler.Content.add(new Brick( 16*GraphicsHandler.count , (int) (Math.random()*801) ));
        //GraphicsHandler.count++;

    }

    @Override
    public void mousePressed(MouseEvent e) {



        //test = true;
        //Player.pos.setMapX(Player.pos.getMapX() + 4);
        //try {
        //    TimeUnit.MILLISECONDS.sleep(20);
        //} catch (InterruptedException e1) {
        //    e1.printStackTrace();
        //}
        //Holder h = new Holder();
        //h.start();


    }

    @Override
    public void mouseReleased(MouseEvent e) {
        test = false;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }


}

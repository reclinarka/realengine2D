package de.reclinarka.util;

import de.reclinarka.objects.solid.blocks.Brick;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


/**
 * Created by reclinarka on 15.12.2016.
 */
public class OnClick implements MouseListener, MouseMotionListener{

    public static boolean test=false;
    private static int lvl = 0;



    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getX() + "  " + e.getY() );


    }

    @Override
    public void mousePressed(MouseEvent e) {

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

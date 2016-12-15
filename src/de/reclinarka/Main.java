package de.reclinarka;


import de.reclinarka.objects.Drawable;
import de.reclinarka.objects.solid.Block;
import de.reclinarka.screen.Window;
import de.reclinarka.screen.types.Slate;

import javax.swing.*;

public class Main extends Thread{

    public static void main(String[] args) {
        new Thread();
        Slate s = new Slate();
        s.addDrawable(new Block(400,400,0,0));
        s.addDrawable(new Block(400,300,0,0));
        Window frame = new Window("Test",s);
        while (true) {
            //TimeUnit.MILLISECONDS.sleep(1000/20);
            s.getContent().forEach((f) -> mover(s,f));
            frame.repaint();
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

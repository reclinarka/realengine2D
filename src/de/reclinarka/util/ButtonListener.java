package de.reclinarka.util;

import de.reclinarka.graphics.GraphicsHandler;
import de.reclinarka.objects.entities.Player;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by reclinarka on 21.02.2017.
 */
public class ButtonListener implements KeyListener {

    private GraphicsHandler graphicsHandler;

    public ButtonListener(GraphicsHandler graphicsHandler){
        this.graphicsHandler = graphicsHandler;
        left = new Mover(-graphicsHandler.getCurrentMap().getPlayers().get(0).speed, graphicsHandler);
        right = new Mover(graphicsHandler.getCurrentMap().getPlayers().get(0).speed, graphicsHandler);
        right.start();
        left.start();
    }

    private Mover left;

    private Mover right;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyChar() == ' '){      //jumpButton
            graphicsHandler.getCurrentMap().getPlayers().get(0).setVelocity(-3);
        }

        if(e.getKeyChar() == 'd'){
            right.active = true;
        }

        if(e.getKeyChar() == 'a'){
            left.active = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyChar() == 'd'){
            right.active = false;
        }

        if(e.getKeyChar() == 'a'){
            left.active = false;
        }
    }
}

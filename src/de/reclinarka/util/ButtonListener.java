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
            graphicsHandler.getCurrentMap().getPlayers().get(0).getNewVelocity().setY(-3);
        }

        if(e.getKeyChar() == 'd'){
            graphicsHandler.getCurrentMap().getPlayers().get(0).getNewVelocity().setX(3);
        }

        if(e.getKeyChar() == 'a'){
            graphicsHandler.getCurrentMap().getPlayers().get(0).getNewVelocity().setX(-3);
        }

        if(e.getKeyChar() == '+'){
            graphicsHandler.setZoom(graphicsHandler.getZoom()+1);
        }

        if(e.getKeyChar() == '-'){
            graphicsHandler.setZoom(graphicsHandler.getZoom()-1);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyChar() == 'd'){
            graphicsHandler.getCurrentMap().getPlayers().get(0).getNewVelocity().setX(0);
        }

        if(e.getKeyChar() == 'a'){
            graphicsHandler.getCurrentMap().getPlayers().get(0).getNewVelocity().setX(0);
        }
    }
}

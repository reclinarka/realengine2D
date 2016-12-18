package de.reclinarka.util;

import de.reclinarka.player.Player;

import java.util.concurrent.TimeUnit;

import static de.reclinarka.player.Player.pos;

/**
 * Created by reclinarka on 18.12.2016.
 */
public class RunChecker extends Thread{

    private int tempx;

    public RunChecker(){
        tempx = Player.pos.getMapX();
    }

    public void run(){
        RunAnimator run = new RunAnimator();
        run.start();
        while(true) {
            if (tempx < Player.pos.getMapX()) {
                run.right = true;
            } else {
                run.right = false;
            }
            tempx = Player.pos.getMapX();
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

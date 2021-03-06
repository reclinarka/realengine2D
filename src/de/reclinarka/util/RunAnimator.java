package de.reclinarka.util;

import de.reclinarka.player.Player;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by reclinarka on 18.12.2016.
 */
public class RunAnimator extends Thread{

    public boolean right = false;

    private int count;

    public RunAnimator(){





    }

    public void run(){
        while(true){
            count = 0;
            //right = true;
            while(right){
                count = count % 2;

                try {
                    Player.texture = ImageIO.read(getClass().getResourceAsStream("/de/reclinarka/resources/MoveRight_" + count + ".png"));
                } catch (IOException e) {
                    e.printStackTrace();
                }

                try {
                    TimeUnit.MILLISECONDS.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                count++;

            }
            try {
                Player.texture = ImageIO.read(getClass().getResourceAsStream("/de/reclinarka/resources/Player.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }

            count = 1;
        }

    }

}

package de.reclinarka.util;

/**
 * Created by reclinarka on 29.12.2016.
 */
public class Threader extends Thread{
    @Override
    public void run() {
        new JavaFXInitializer(new JavaFXInitializer());
    }
}

package de.reclinarka.util;

import de.reclinarka.objects.Drawable;

import java.util.ArrayList;

/**
 * Created by reclinarka on 15.12.2016.
 */
public class DrawablePrinter {
    public static void print(ArrayList<Drawable> list){
        System.out.println("");
        list.forEach((f) -> System.out.println(f.getPos().getX())    );
    }


}

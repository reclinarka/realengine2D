package de.reclinarka.util;

import de.reclinarka.objects.Drawable;

import java.util.ArrayList;

/**
 * Created by reclinarka on 03.01.2017.
 */
public class GetByID {
    public static Drawable getDrawableByID(ArrayList<Drawable> source, String ID) {
        curr = null;
        source.forEach( (f) -> containsID(f, ID) );
        return curr;
    }

    private static Drawable curr;

    private static void containsID(Drawable input, String ID) {
        if(input.getID().contentEquals(ID)) curr = input;

    }
}

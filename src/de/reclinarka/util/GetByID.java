package de.reclinarka.util;

import de.reclinarka.objects.Drawable;

import java.util.ArrayList;

/**
 * Created by reclinarka on 03.01.2017.
 */
public class GetByID {
    public Drawable getDrawableByID(ArrayList<Drawable> source, String ID) {
        for(int i = 0; i < source.size(); i++ ){
            if(containsID(source.get(i), ID)){
                return source.get(i);
            }
        }
        return null;
    }

    private boolean containsID(Drawable input, String ID) {
        if(input.getID().contentEquals(ID)) return true;
        return false;
    }
}

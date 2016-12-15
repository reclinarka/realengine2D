package de.reclinarka.util;

import de.reclinarka.objects.Drawable;

import java.util.Comparator;

/**
 * Created by reclinarka on 15.12.2016.
 */
public class xCpmparator implements Comparator<Drawable>{
    @Override
    public int compare(Drawable o1, Drawable o2) {
        return o2.getPos().getX() - o1.getPos().getX();
    }
}

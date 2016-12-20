package de.reclinarka.util;

import de.reclinarka.objects.background.BackGround;

import java.util.Comparator;

/**
 * Created by phpolland on 20.12.2016.
 */
public class BgCompare implements Comparator<BackGround> {

    @Override
    public int compare(BackGround o1, BackGround o2) {
        return Float.compare(o1.getLayer().getModifier(), o2.getLayer().getModifier());
    }
}

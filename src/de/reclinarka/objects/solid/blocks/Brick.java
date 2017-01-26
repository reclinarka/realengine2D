package de.reclinarka.objects.solid.blocks;

import de.reclinarka.objects.Coordinate;
import de.reclinarka.objects.Hitbox;
import de.reclinarka.objects.solid.Block;

/**
 * Created by reclinarka on 14.12.2016.
 */
public class Brick extends Block {
    public Brick(int mapX, int mapY){
        setPos(new Coordinate(mapX,mapY));
        setHitbox(new Hitbox(mapX,mapY,getWidth(),getHeight()));
        setBlock_ID("Brick");
        update();
    }
}

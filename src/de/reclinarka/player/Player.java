package de.reclinarka.player;

import de.reclinarka.objects.Coordinate;
import de.reclinarka.objects.Hitbox;


/**
 * Created by reclinarka on 18.12.2016.
 */
public class Player {
    public Player(int mapX, int mapY){
        pos = new Coordinate(mapX,mapY);
        hitbox = new Hitbox(mapX,mapY,16,32);
    }

    public void init(){
        pos.setMapX(50);
        pos.setMapY(200);

    }

    private static Hitbox hitbox;
    private static Coordinate pos;

    public static Coordinate getPos() {
        return pos;
    }

    public static Hitbox getHitbox() {
        return hitbox;
    }
}

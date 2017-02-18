package de.reclinarka.util;

import de.reclinarka.objects.Coordinate;
import de.reclinarka.objects.Drawable;
import de.reclinarka.objects.text.dialogue.DialogueAnimator;

import java.awt.*;

/**
 * Created by reclinarka on 18.02.2017.
 */
public class CollisionChecker {
    public static Coordinate newPos(Drawable obj1, Coordinate pos, int height, int width){
               // Point A
        int a; // x
        int b; // y
               // Point B
        int c; // x
        int d; // y

        int tmpX;

        boolean ySwitch = false;
        int stepDirection;

        int xDifference = obj1.getPos().getMapX() - pos.getMapX();
        if(obj1.getPos().getMapX() == pos.getMapX() || ( ( (xDifference < 2) && (xDifference > 0) ) || ( (xDifference < 0) && (xDifference > -2) ) ) ){ // if
            ySwitch = true;

            a = pos.getMapY();
            b = pos.getMapX();

            c = obj1.getPos().getMapY();
            d = obj1.getPos().getMapX();
        } else {
            a = pos.getMapX();
            b = pos.getMapY();

            c = obj1.getPos().getMapX();
            d = obj1.getPos().getMapY();
        }

        if( a > c){
            stepDirection = 1;
        } else {
            stepDirection = -1;
        }

        tmpX = c;
        if(ySwitch){
            while (new Rectangle(tmpX,linefunctionY(a,b,c,d,tmpX) - width,height,width).intersects(new Rectangle(c,d - obj1.getWidth(),obj1.getHeight(),obj1.getWidth()))){
                tmpX += stepDirection;
            }
        } else {
            while (new Rectangle(tmpX,linefunctionY(a,b,c,d,tmpX),width,height).intersects(new Rectangle(c,d,obj1.getWidth(),obj1.getHeight()))){
                tmpX += stepDirection;
            }
        }

        if(ySwitch){
            return (new Coordinate(linefunctionY(a,b,c,d,tmpX),tmpX));
        } else {
            return (new Coordinate(tmpX, linefunctionY(a,b,c,d,tmpX)));
        }



    }

    private static int linefunctionY (int a, int b, int c, int d, int x) {

        return ( ( ( ( d - b ) / ( c - a ) ) * ( x - a ) ) + c );
    }
}

package de.reclinarka.objects.animation;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by reclinarka on 03.01.2017.
 */
public class SelectiveAnimation extends Animation {

    public SelectiveAnimation(String[] inSource) {
        for(int i = 0; i < inSource.length;i++){
            textureImport(inSource[i]);
        }
    }

    public void next(){
        BufferedImage tmp = getContent().get(0);
        getContent().remove(0);
        getContent().add(tmp);
    }

    public void draw(Graphics g, int width, int height, int x, int y){
        g.drawImage(getContent().get(0),x,y,width,height,null);
    }


}

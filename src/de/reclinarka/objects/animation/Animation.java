package de.reclinarka.objects.animation;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;

/**
 * Created by reclinarka on 03.01.2017.
 */
public class Animation {
    public Animation(String[] inSource,float speed){
        for(int i = 0; i < inSource.length;i++){
            textureImport(inSource[i]);
        }
        countCap = (int) (120 * speed);
    }
    private ArrayList<BufferedImage> content = new ArrayList<BufferedImage>();
    private int count;
    private int countCap;

    public Animation() {
    }

    void textureImport(String inSource){
        BufferedImage tmp;
        try {
            tmp = ImageIO.read(getClass().getResourceAsStream(inSource));
            content.add(tmp);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private BufferedImage getCurrentSprite(){
        if(count>countCap){
            BufferedImage tmp = content.get(0);
            content.remove(0);
            content.add(tmp);
        }
        return content.get(0);
    }

    public ArrayList<BufferedImage> getContent() {
        return content;
    }

    public void next(){
        BufferedImage tmp = getContent().get(0);
        getContent().remove(0);
        getContent().add(tmp);
    }

    public void draw(Graphics g, int width, int height, int x, int y){
        g.drawImage(getCurrentSprite(),x,y,width,height,null);
        count++;

    }
}

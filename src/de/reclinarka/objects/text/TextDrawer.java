package de.reclinarka.objects.text;

import de.reclinarka.objects.Coordinate;

import java.awt.*;

/**
 * Created by reclinarka on 29.12.2016.
 */
public class TextDrawer{

    public TextDrawer(Coordinate pos, int step,int decay){
        this.pos = pos;
        this.step = step;
        this.decay = decay;
    }

    public TextDrawer() {

    }

    private int decay;
    private Coordinate pos;
    private int step;
    private int count;
    private int stepCount = 1;

    public void setPos(Coordinate pos) {
        this.pos = pos;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setDecay(int decay) {
        this.decay = decay;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public void setStepCount(int stepCount) {
        this.stepCount = stepCount;
    }


    public Coordinate getPos() {
        return pos;
    }

    public int getCount() {
        return count;
    }

    public int getDecay() {
        return decay;
    }

    public int getStep() {
        return step;
    }

    public int getStepCount() {
        return stepCount;
    }


    public void draw(Graphics g, String[] content, int zoom, int size) {
        count++;
        if(count >= step){
            stepCount++;
            count = 0;
        }

        if(stepCount < decay) {
            int tmpCount = 0;
            for (int i = 0; i < content.length; i++) {
                tmpCount++;
                if (tmpCount > stepCount) return;
                for (int o = 0; o < content[i].length(); o++) {
                    if (tmpCount > stepCount) return;
                    g.drawString(String.valueOf(content[i].charAt(o)), pos.getX() + (o * size * zoom), pos.getY() + (i * size * zoom));
                    tmpCount++;
                }
            }
        }
    }

}

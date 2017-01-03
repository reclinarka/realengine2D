package de.reclinarka.objects.text.dialogue;

import de.reclinarka.graphics.GraphicsHandler;
import de.reclinarka.objects.Coordinate;
import de.reclinarka.objects.text.TextDrawer;
import de.reclinarka.util.GetByID;

import java.awt.*;
import java.util.Collection;

/**
 * Created by reclinarka on 03.01.2017.
 */
public class DialogueAnimator extends TextDrawer{
    public DialogueAnimator(Coordinate pos, int step, int decay, int[] marks, String CorrespID, GraphicsHandler graphicsHandler){
        setPos(pos);
        setStep(step);
        setDecay(decay);
        this.marks = marks;
        this.graphicsHandler = graphicsHandler;
        CorrespondingID = CorrespID;
    }

    private String CorrespondingID;
    private int[] marks;
    private GraphicsHandler graphicsHandler;

    @Override
    public void draw(Graphics g, String[] content, int zoom, int size) {
        setCount(getCount() + 1);
        if(getCount() >= getStep()){
            setStepCount(getStepCount() + 1);
            setCount(0);
            for(int i = 0; i < marks.length; i++){
                if(getStepCount() == marks[i]){
                    if(GetByID.getDrawableByID(graphicsHandler.getCurrentMap().getContent(), CorrespondingID) != null)
                        GetByID.getDrawableByID(graphicsHandler.getCurrentMap().getContent(), CorrespondingID).getAnimation().next();
                }
            }
        }



        if(getStepCount() < getDecay()) {
            int tmpCount = 0;
            for (int i = 0; i < content.length; i++) {
                tmpCount++;
                if (tmpCount > getStepCount()) return;
                for (int o = 0; o < content[i].length(); o++) {
                    if (tmpCount > getStepCount()) return;
                    g.drawString(String.valueOf(content[i].charAt(o)), getPos().getX() + (o * size * zoom), getPos().getY() + (i * size * zoom));
                    tmpCount++;
                }
            }
        }
    }
}

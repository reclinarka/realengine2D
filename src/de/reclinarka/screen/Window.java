package de.reclinarka.screen;

import de.reclinarka.util.OnClick;

import javax.swing.*;
import java.awt.*;

/**
 * Created by reclinarka on 14.12.2016.
 */
public class Window extends JFrame {
    public Window(int width, int height, String windowTitle, JPanel content) {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setPreferredSize(new Dimension(width, height));
        setResizable(true);
        setTitle(windowTitle);
        this.getContentPane().addMouseListener(new OnClick());
        init(content);
    }

    public Window(String windowTitle, JPanel content) {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setPreferredSize(new Dimension(800, 800));
        setResizable(true);
        setTitle(windowTitle);

        init(content);
    }

    private void init(JPanel content) {
        //setLocationRelativeTo(null);
        setLayout(new GridLayout(1, 1, 0, 0));

        getContentPane().add(content);
        pack();
        setVisible(true);
    }



}

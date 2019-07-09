package com.view;

import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {


    private void initFrame(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initPanel(){
        JPanel panel = new JPanel(){
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
            }
        };
        panel.setBackground(Color.BLACK);
        panel.setPreferredSize(new Dimension(800,600));
        add(panel);
    }


}

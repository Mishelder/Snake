package com.view;

import com.controller.*;
import com.model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame implements ActionListener {

    private Snake snake = new Snake();
    public static boolean inGame = true;
    private MoveBody moveBody = new MoveBody();
    private MoveHead moveHead = new MoveHead();
    private AppleOnSnake apple = new AppleOnSnake();
    private EatApple eatApple = new EatApple();
    private Death death = new Death();
    private CheckRange checkRange = new CheckRange();

    public static void main(String[] args){
        new Game();
    }

    private Game(){
        new Head(3,2);
        new Body(2,2);
        Timer timer = new Timer(250,this);
        timer.start();
        new Apple();
        addKeyListener(new RotateHead());
        initPanel();
        initFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(!checkRange.inField())
            inGame=false;
        if(apple.isAppleOnSnake())
            new Apple();
        moveBody.move();
        moveHead.moveHead();
        eatApple.checkApple();
        death.checkDeath();
        repaint();
    }

    private void initFrame(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setTitle("SnakeGame");
        setIconImage(loadImage("title"));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initPanel(){
        JPanel panel = new JPanel(){
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                if(inGame) {

                    for (int i = 1; i < snake.getCoordSnake().size(); i++) {
                        g.drawImage(loadImage(Snake.figureSnake.get(i).name()),
                                Snake.coordSnake.get(i).getX() * snake.getImage(),
                                Snake.coordSnake.get(i).getY() * snake.getImage(), this);
                    }
                    g.drawImage(loadImage("apple"),
                            Apple.X * snake.getImage(),
                            Apple.Y * snake.getImage(), this);


                    if(Head.right)
                        g.drawImage(loadImage("rightHead"),
                                Snake.coordSnake.get(0).getX() * snake.getImage(),
                                Snake.coordSnake.get(0).getY() * snake.getImage(), this);
                        if(Head.left)
                            g.drawImage(loadImage("leftHead"),
                                    Snake.coordSnake.get(0).getX() * snake.getImage(),
                                    Snake.coordSnake.get(0).getY() * snake.getImage(), this);
                            if(Head.up)
                                g.drawImage(loadImage("upHead"),
                                        Snake.coordSnake.get(0).getX() * snake.getImage(),
                                        Snake.coordSnake.get(0).getY() * snake.getImage(), this);
                                if(Head.down)
                                    g.drawImage(loadImage("head"),
                                            Snake.coordSnake.get(0).getX() * snake.getImage(),
                                            Snake.coordSnake.get(0).getY() * snake.getImage(), this);



                }else{
                    g.drawImage(loadImage("gameover"),
                            0,
                            0, this);
                }
            }
        };
        panel.setBackground(Color.decode("#f4e89a"));
        panel.setPreferredSize(new Dimension(800,600));
        add(panel);
    }

    private Image loadImage(String name){
        String filename = "/img/" +name+".png";
        ImageIcon icon = new ImageIcon(getClass().getResource(filename));
        return icon.getImage();
    }
}

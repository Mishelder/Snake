package com.model;

import java.awt.*;

public class Apple implements Parametr {

    private int X;
    private int Y;
    private Image apple;
    private int image = 25;

    Apple(){
        randomApple();
        X*=image;
        Y*=image;
    }

    private void randomApple(){
        X=(int) (Math.random()*width);
        Y=(int) (Math.random()*height);
    }
}

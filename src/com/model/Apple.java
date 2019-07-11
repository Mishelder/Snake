package com.model;

import java.awt.*;

public class Apple implements Parameter {

    public static int X;
    public static int Y;
    private Image apple;

    public Apple(){
        randomApple();
    }

    private void randomApple(){
        X=(int) (Math.random()*width);
        Y=(int) (Math.random()*height);
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public Image getApple() {
        return apple;
    }

    public void setApple(Image apple) {
        this.apple = apple;
    }
}

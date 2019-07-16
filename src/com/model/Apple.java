package com.model;

public class Apple implements Parameter {

    public static int X;
    public static int Y;

    public Apple(){
        randomApple();
    }

    private void randomApple(){
        X=(int) (Math.random()*width);
        Y=(int) (Math.random()*height);
    }


}

package com.model;


public class Head extends Snake {

    public static boolean left = false;
    public static boolean right = true;
    public static boolean up = false;
    public static boolean down = false;

    public Head(final int x,final int y){
        super(x,y,Figure.head);
    }

}

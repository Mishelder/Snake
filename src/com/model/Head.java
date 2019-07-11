package com.model;

import java.awt.*;

public class Head extends Snake {

    public static boolean left = false;
    public static boolean right = true;
    public static boolean up = false;
    public static boolean down = false;
    private Image head;

    public Head(final int x,final int y){
        super(x,y,Figure.head);
    }

    public  Image getHead() {
        return head;
    }

    public void setHead(Image head) {
        this.head = head;
    }
}

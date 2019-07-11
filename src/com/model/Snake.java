package com.model;

import java.util.ArrayList;

public class Snake {

    private int image = 25;
    public static  ArrayList<Coord> coordSnake = new ArrayList<>();
    public static  ArrayList<Figure> figureSnake = new ArrayList<>();

    public Snake(){}

    Snake(final int x,final int y,final Figure figure){
        coordSnake.add(new Coord(x,y));
        figureSnake.add(figure);
    }

    public ArrayList<Coord> getCoordSnake() {
        return coordSnake;
    }

    public int getImage() {
        return image;
    }
}

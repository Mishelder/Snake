package com.model;

import java.util.ArrayList;

class Snake {

    private int image = 20;
    private ArrayList<Coord> coordSnake = new ArrayList<>();

    Snake(final int x,final int y){
        coordSnake.add(new Coord(x,y));
    }
}

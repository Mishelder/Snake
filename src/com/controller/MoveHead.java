package com.controller;

import com.model.*;

public class MoveHead {

    public void moveHead(){
        if(Head.right)
            Snake.coordSnake.set(0,new Coord (Snake.coordSnake.get(0).getX()+1,Snake.coordSnake.get(0).getY()));
        if(Head.left)
            Snake.coordSnake.set(0,new Coord (Snake.coordSnake.get(0).getX()-1,Snake.coordSnake.get(0).getY()));
        if(Head.up)
            Snake.coordSnake.set(0,new Coord (Snake.coordSnake.get(0).getX(),Snake.coordSnake.get(0).getY()-1));
        if(Head.down)
            Snake.coordSnake.set(0,new Coord (Snake.coordSnake.get(0).getX(),Snake.coordSnake.get(0).getY()+1));
    }
}

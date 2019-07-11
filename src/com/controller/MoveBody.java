package com.controller;

import com.model.Snake;

public class MoveBody {

    public void move(){
        for (int i = Snake.coordSnake.size()-1; i>0; i--)
            Snake.coordSnake.set(i, Snake.coordSnake.get(i - 1));
    }
}

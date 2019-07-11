package com.controller;

import com.model.Apple;
import com.model.Coord;
import com.model.Snake;

public class AppleOnSnake {

    public boolean isAppleOnSnake(){
        for (Coord coord : Snake.coordSnake){
            if(coord.getX()== Apple.X)
                if(coord.getY()==Apple.Y) {
                    return true;
                }
        }
        return false;
    }
}

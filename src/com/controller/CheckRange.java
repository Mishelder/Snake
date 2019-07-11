package com.controller;

import com.model.Coord;
import com.model.Parameter;
import com.model.Snake;

public class CheckRange implements Parameter {

    public boolean inField(){
        if(inRange(Snake.coordSnake.get(0)))
            return true;
        return false;
    }


    private boolean inRange(final Coord coord){
        return coord.getX()>=0&&coord.getX()<Parameter.width&&
                coord.getY()>=0&&coord.getY()<Parameter.height;
    }
}

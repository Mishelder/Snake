package com.controller;

import com.model.Apple;
import com.model.Coord;
import com.model.Figure;
import com.model.Snake;

public class EatApple {

    public void checkApple(){
        if(Snake.coordSnake.get(0).getX()== Apple.X&&Snake.coordSnake.get(0).getY()==Apple.Y) {
            Snake.coordSnake.add(Snake.coordSnake.size(), new Coord(
                    Snake.coordSnake.get(Snake.coordSnake.size() - 1).getX(),
                    Snake.coordSnake.get(Snake.coordSnake.size() - 1).getY()));
            Snake.figureSnake.add(Figure.body);
            new Apple();
        }
    }
}

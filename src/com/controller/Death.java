package com.controller;

import com.model.Snake;
import com.view.Game;

public class Death {

    public void checkDeath(){
        for (int i = 1; i < Snake.coordSnake.size() ; i++) {
            if (Snake.coordSnake.get(0).getX() == Snake.coordSnake.get(i).getX() )
                if(Snake.coordSnake.get(0).getY() == Snake.coordSnake.get(i).getY())
                    Game.inGame = false;
        }
    }
}

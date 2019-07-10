package com.controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import com.model.Head;


public class RotateHead extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            if(key==KeyEvent.VK_W&&!(Head.down)){
                Head.up=true;
                Head.left=false;
                Head.right=false;
            }
            if(key==KeyEvent.VK_A&&!(Head.right)){
                Head.up = false;
                Head.left = true;
                Head.down = false;
            }
            if(key==KeyEvent.VK_D&&!(Head.left)){
                Head.up = false;
                Head.right=true;
                Head.down = false;
            }
            if(key==KeyEvent.VK_S&&!(Head.up)){
                Head.left=false;
                Head.right=false;
                Head.down = true;
            }
        }

}

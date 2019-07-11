package com.model;

import java.awt.*;

public class Body extends Snake {

    private Image body;

    public Body(final int x,final int y) {
        super(x, y,Figure.body);
    }

    public Image getBody() {
        return body;
    }

    public void setBody(Image body) {
        this.body = body;

    }
}

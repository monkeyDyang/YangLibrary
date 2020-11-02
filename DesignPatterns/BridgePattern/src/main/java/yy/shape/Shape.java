package yy.shape;

import yy.color.DrawAPI;

public abstract class Shape {

    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}

package yy.shape;

import yy.color.DrawAPI;

public class Circle extends Shape {
    public Circle(DrawAPI drawAPI) {
        super(drawAPI);
    }

    public void draw() {
        System.out.println("Circle");
        drawAPI.color();
    }
}

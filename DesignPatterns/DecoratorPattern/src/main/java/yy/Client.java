package yy;

import yy.decorator.RedShapeDecorator;
import yy.decorator.ShapeDecorator;
import yy.shape.Circle;
import yy.shape.Shape;

public class Client {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());

        //circle.draw();
        redCircle.draw();
    }
}

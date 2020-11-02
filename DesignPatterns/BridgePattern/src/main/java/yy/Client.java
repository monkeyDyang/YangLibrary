package yy;

import yy.color.Red;
import yy.shape.Circle;
import yy.shape.Shape;

public class Client {
    public static void main(String[] args) {
        Shape shape1 = new Circle(new Red());

        shape1.draw();
    }
}

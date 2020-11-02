package yy.factory;

import yy.shape.Circle;
import yy.shape.Shape;

import java.util.HashMap;

public class ShapeFactory {

    private static final HashMap<String, Shape> circleMap = new HashMap<String, Shape>();

    public static Shape getCircle(String color){
        //从Map中获取指定color的circle对象
        Circle circle = (Circle)circleMap.get(color);

        //如果对象为空，则生成该对象，并加入的map中
        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }

}

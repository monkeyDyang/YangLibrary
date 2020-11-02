package yy;

import yy.product.Shape;

public class Client {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape2.getType());

        System.out.println("clonedShape：" + clonedShape.hashCode());
        System.out.println("clonedShape2：" + clonedShape2.hashCode());
    }
}

package yy;

import yy.product.Rectangle;
import yy.product.Shape;
import yy.product.Square;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    /* 通过clone的方式获取新对象 */
    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加二种形状
    public static void loadCache() {

        /* 已存在的原型类 */
        Square square = new Square();
        square.setId("1");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}

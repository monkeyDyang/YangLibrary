package yy.decorator;

import yy.shape.Shape;

/* 实现Shape对象的抽象修饰类 */
public abstract class ShapeDecorator implements Shape{

    protected Shape shapeDecorator;

    //通过构造函数传递给被修饰者
    public ShapeDecorator(Shape shape){
        this.shapeDecorator = shape;
    }

    //委托给被修饰者执行
    public void draw(){
        shapeDecorator.draw();
    }
}

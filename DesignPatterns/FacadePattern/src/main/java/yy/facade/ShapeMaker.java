package yy.facade;

import yy.subsystem.Rectangle;
import yy.subsystem.Square;

public class ShapeMaker implements ShapeMarker {
    private Rectangle rectangle;
    private Square square;

    public ShapeMaker(){
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void RectangleDraw() {
        rectangle.draw();
    }

    public void SquareDraw() {
        square.draw();
    }
}

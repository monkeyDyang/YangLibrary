package yy;

import yy.facade.ShapeMaker;
import yy.facade.ShapeMarker;

public class Client {
    public static void main(String[] args) {

        ShapeMarker marker = new ShapeMaker();

        marker.RectangleDraw();
        marker.SquareDraw();

    }
}

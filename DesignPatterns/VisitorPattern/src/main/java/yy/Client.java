package yy;

import yy.part.ComputerPart;
import yy.part.impl.Computer;
import yy.visitor.ComputerPartVisitor;
import yy.visitor.impl.ComputerPartDisplayVisitor;

public class Client {
    public static void main(String[] args) {
        ComputerPartVisitor visitor = new ComputerPartDisplayVisitor();

        ComputerPart part = new Computer();
        part.accept(visitor);
    }
}

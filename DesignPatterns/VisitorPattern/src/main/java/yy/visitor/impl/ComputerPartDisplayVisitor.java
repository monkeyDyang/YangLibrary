package yy.visitor.impl;

import yy.part.impl.Computer;
import yy.part.impl.Keyboard;
import yy.part.impl.Mouse;
import yy.visitor.ComputerPartVisitor;

/* 具体访问者，给出对每一个元素类访问时所产生的具体行为   */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    public void visitorComputer(Computer computer) {
        System.out.println("visitorComputer Computer computer");
    }

    public void visitorMouse(Mouse mouse) {
        System.out.println("visitorMouse Mouse mouse");
    }

    public void visitorKeyboard(Keyboard keyboard) {
        System.out.println("visitorKeyboard Keyboard keyboard");
    }
}

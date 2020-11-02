package yy.part;

import yy.visitor.ComputerPartVisitor;

public interface ComputerPart {
    //接受访问者（accept）的方法
    void accept(ComputerPartVisitor visitor);
}

package yy.part.impl;

import yy.part.ComputerPart;
import yy.visitor.ComputerPartVisitor;

public class Keyboard implements ComputerPart {
    // 提供接受访问的具体实现，通常情况下是使用访问者提供的访问该元素类的方法。
    public void accept(ComputerPartVisitor visitor) {
        visitor.visitorKeyboard(this);
    }
}

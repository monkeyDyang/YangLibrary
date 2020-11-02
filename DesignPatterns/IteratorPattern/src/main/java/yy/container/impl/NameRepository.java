package yy.container.impl;

import yy.container.Container;
import yy.container.interator.Iterator;

public class NameRepository implements Container {
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    public Iterator getIterator() {
        return new NameIterator();
    }

    // 私有内部类
    private class NameIterator implements Iterator {
        int index;
        public boolean hashNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        public Object next() {
            if(this.hashNext()){
                return names[index++];
            }
            return null;
        }
    }
}

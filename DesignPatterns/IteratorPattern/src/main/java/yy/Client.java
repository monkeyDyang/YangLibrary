package yy;

import yy.container.Container;
import yy.container.impl.NameRepository;
import yy.container.interator.Iterator;

public class Client {
    public static void main(String[] args) {
        Container container = new NameRepository();

        Iterator iterator = container.getIterator();

        while (iterator.hashNext()){
            String name = (String) iterator.next();
            System.out.println(name);
        }

    }
}

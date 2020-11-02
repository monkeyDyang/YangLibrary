package yy;

import yy.observer.Subject;
import yy.observer.subobserver.BinaryObserver;
import yy.observer.subobserver.HexaObserver;
import yy.observer.subobserver.OctalObserver;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {

        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);

        // 被观察者状态发生改变时，观察者做出不同的相应
        subject.setState(2);

    }
}

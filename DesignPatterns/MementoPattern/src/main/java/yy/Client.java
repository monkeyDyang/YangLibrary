package yy;

import yy.memento.CareTaker;
import yy.memento.Originator;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");
        // 存储 #2 状态
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        // 存储 #3 状态
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        // 当前状态 #4
        System.out.println("Current State: " + originator.getState());
        // 恢复存储的第0状态 #2
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        // 恢复存储的第1状态 #3
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}

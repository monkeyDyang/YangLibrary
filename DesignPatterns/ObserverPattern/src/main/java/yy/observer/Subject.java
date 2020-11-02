package yy.observer;

import java.util.ArrayList;
import java.util.List;

/* 被观察者 */
public class Subject {
    // 观察者们
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    // 修改状态
    public void setState(int state) {
        this.state = state;
        // 修改状态时通知所有观察者
        notifyAllObservers();
    }

    // 增加观察者
    public void attach(Observer observer){
        observers.add(observer);
    }

    // 通知所有观察者，并做出相应
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

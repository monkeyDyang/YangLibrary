package yy.observer.subobserver;

import yy.observer.Observer;
import yy.observer.Subject;

public class OctalObserver extends Observer {
    public OctalObserver(Subject subject){
        this.subject = subject;
        // 实例化观察者时，将其添加到被观察者对象中的观察者数组中
        this.subject.attach(this);
    }

    public void update() {
        System.out.println("OctalObserver:"+subject.getState());
    }
}

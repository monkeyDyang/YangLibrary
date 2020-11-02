package yy.state.impl;

import yy.context.Context;
import yy.state.State;

public class StopState implements State {
    public void doAction(Context context) {
        System.out.println("Stop State doAction");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}

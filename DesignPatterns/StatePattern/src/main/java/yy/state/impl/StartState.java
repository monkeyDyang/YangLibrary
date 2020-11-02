package yy.state.impl;

import yy.context.Context;
import yy.state.State;

public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("Start State doAction");
        // 改变状态
        context.setState(this);
    }

    // 不同的行为
    public String toString(){
        return "Start State";
    }
}

package yy.context;

import yy.state.State;

public class Context {

    // 带有某个状态State
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}

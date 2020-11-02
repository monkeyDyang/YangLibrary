package yy;

import yy.context.Context;
import yy.state.impl.StartState;
import yy.state.impl.StopState;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        // 状态改变--start
        StartState startState = new StartState();
        startState.doAction(context);
        // 行为改变
        System.out.println(context.getState().toString());

        // 状态改变--stop
        StopState stopState = new StopState();
        stopState.doAction(context);
        // 行为改变
        System.out.println(context.getState().toString());
    }
}

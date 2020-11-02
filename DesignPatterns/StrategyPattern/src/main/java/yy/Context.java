package yy;

import yy.strategy.Strategy;

//使用 Context 来查看当它改变策略 Strategy 时的行为变化。
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int a,int b){
        return strategy.doOperation(a,b);
    }
}

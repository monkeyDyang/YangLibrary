package yy.strategy.impl;

import yy.strategy.Strategy;

public class OperationAdd implements Strategy {
    public int doOperation(int a,int b) {
        return a + b;
    }
}

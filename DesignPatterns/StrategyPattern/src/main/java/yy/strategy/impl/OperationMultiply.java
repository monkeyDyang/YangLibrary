package yy.strategy.impl;

import yy.strategy.Strategy;

public class OperationMultiply implements Strategy {
    public int doOperation(int a, int b) {
        return a * b;
    }
}

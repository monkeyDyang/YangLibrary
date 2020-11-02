package yy.expression.impl;

import yy.expression.Expression;

public class AndExpression implements Expression {
    private Expression expression1 = null;
    private Expression expression2 = null;

    public AndExpression(Expression expr1,Expression expr2){
        this.expression1 = expr1;
        this.expression2 = expr2;
    }

    public boolean interpret(String context) {
        return expression1.interpret(context) && expression2.interpret(context);
    }
}

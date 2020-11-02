package yy.expression;

import yy.expression.impl.AndExpression;
import yy.expression.impl.OrExpression;
import yy.expression.impl.TerminalExpression;

/* 规则初始化 */
public class InitExpression {

    //规则1：Robert 和 John 是男性
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //规则2：Julie 是一个已婚的女性
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }
}

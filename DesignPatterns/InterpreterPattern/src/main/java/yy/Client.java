package yy;

import yy.expression.Expression;
import yy.expression.InitExpression;


public class Client {
    public static void main(String[] args) {
        Expression isMale = InitExpression.getMaleExpression();
        Expression isMarriedWoman = InitExpression.getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
    }
}

import yy.Context;
import yy.strategy.Strategy;
import yy.strategy.impl.OperationAdd;

public class Client {
    public static void main(String[] args) {

        // 采取add策略
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(1,1));

        // Sub....
        // Mul....
        // Div....

    }
}

package yy.customer;

import yy.customer.sub.NullCustomer;
import yy.customer.sub.RealCustomer;

public class CustomerFactory {
    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name){
        // 若存在，返回真实对象
        for (String s : names) {
            if (s.equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }

        // 若不存在，返回空对象
        return new NullCustomer();
    }
}

package yy.order;

import yy.order.Order;

import java.util.ArrayList;
import java.util.List;

/* 命令调用类 */
public class Broker {

    private List<Order> orders = new ArrayList<Order>();

    public void takeOrder(Order order){
        orders.add(order);
    }

    public void executeOrder(){

        for (Order order :orders){
            order.execute();
        }
        orders.clear();
    }
}

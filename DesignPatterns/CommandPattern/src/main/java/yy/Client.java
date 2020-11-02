package yy;

import yy.order.Broker;
import yy.order.impl.BuyStock;
import yy.order.Order;
import yy.order.impl.SellStock;
import yy.order.stock.Stock;

public class Client {
    public static void main(String[] args) {
        // 通过请求者（invoker）调用命令对象（command），命令对象中调用了命令具体执行者（Receiver）
        // 命令具体执行者
        Stock abcStock = new Stock();
        // 命令对象
        Order buyOrder = new BuyStock(abcStock);
        Order sellOrder = new SellStock(abcStock);
        // 请求者
        Broker broker = new Broker();
        broker.takeOrder(buyOrder);
        broker.takeOrder(sellOrder);
        // 执行
        broker.executeOrder();
    }
}

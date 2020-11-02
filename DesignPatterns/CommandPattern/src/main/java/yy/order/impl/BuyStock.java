package yy.order.impl;

import yy.order.Order;
import yy.order.stock.Stock;

public class BuyStock implements Order {
    // 持有真正执行命令对象的引用
    private Stock stock;

    public BuyStock(Stock stock){
        this.stock = stock;
    }

    public void execute() {
        System.out.println("StockBuy:");
        // 调用接收者执行命令的方法
        stock.buy();
    }
}

package yy.order.impl;

import yy.order.Order;
import yy.order.stock.Stock;

public class SellStock implements Order {
    private Stock stock;

    public SellStock(Stock stock){
        this.stock = stock;
    }

    public void execute() {
        System.out.println("StockSell:");
        stock.sell();
    }
}

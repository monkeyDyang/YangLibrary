package yy.item;

import yy.item.packing.Packing;

/* 一种复杂类的接口定义 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}

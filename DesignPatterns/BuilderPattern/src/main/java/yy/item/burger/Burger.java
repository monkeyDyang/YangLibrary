package yy.item.burger;

import yy.item.Item;
import yy.item.packing.Packing;
import yy.item.packing.wrapper.Wrapper;

public abstract class Burger implements Item {

    public Packing packing(){
        return new Wrapper();
    }
}

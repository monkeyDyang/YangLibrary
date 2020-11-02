package yy.item.drink;

import yy.item.packing.bottle.Bottle;
import yy.item.Item;
import yy.item.packing.Packing;

public abstract class Drink implements Item {

    public Packing packing(){
        return new Bottle();
    }
}

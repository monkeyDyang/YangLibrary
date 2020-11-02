package yy.meal;

import yy.item.Item;

import java.util.ArrayList;
import java.util.List;

/* 构建复杂类结构 */
public class Meal {
    private List<Item> list = new ArrayList<Item>();

    public void addItem(Item item){
        list.add(item);
    }

    public float getCost(){

        float cost = 0.0f;
        for (Item item : list){
            cost += item.price();
        }
        return cost;
    }

    public void showItem(){

        for(Item item : list){
            System.out.println("Item:" + item.name());
            System.out.println("Packing:" + item.packing().pack());
            System.out.println("Price:"+ item.price());
            System.out.println("-----------------------------------");
        }
    }
}

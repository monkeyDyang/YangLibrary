package yy.meal;

import yy.item.burger.ChickenBurger;
import yy.item.burger.VegBurger;
import yy.item.drink.Pepsi;

/* 建造复杂类对象 */
public class MealBuilder {

    public Meal popVegMeal(){

        Meal meal = new Meal();

        meal.addItem(new VegBurger());
        meal.addItem(new Pepsi());

        return meal;
    }

    public Meal popNoVegMeal(){

        Meal meal = new Meal();

        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());

        return meal;
    }
}

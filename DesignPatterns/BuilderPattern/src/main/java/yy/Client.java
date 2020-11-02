package yy;

import yy.meal.Meal;
import yy.meal.MealBuilder;

public class Client {
    public static void main(String[] args) {

        MealBuilder builder = new MealBuilder();

        Meal meal = builder.popVegMeal();

        meal.getCost();
        meal.showItem();

    }
}

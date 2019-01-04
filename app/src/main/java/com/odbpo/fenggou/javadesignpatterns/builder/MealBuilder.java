package com.odbpo.fenggou.javadesignpatterns.builder;

import com.odbpo.fenggou.javadesignpatterns.builder.burger.ChickenBurger;
import com.odbpo.fenggou.javadesignpatterns.builder.burger.VegBurger;
import com.odbpo.fenggou.javadesignpatterns.builder.cold_drink.Coke;
import com.odbpo.fenggou.javadesignpatterns.builder.cold_drink.Pepsi;

/**
 * @author: zc
 * @Time: 2019/1/4 10:13
 * @Desc:
 */
public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}

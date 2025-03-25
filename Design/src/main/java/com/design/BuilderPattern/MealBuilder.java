package com.design.BuilderPattern;

public class MealBuilder implements Builder {

    @Override
    public Meal PieMeal() {
        Meal pieMeal = new Meal();
        pieMeal.addItems(new Pie());
        pieMeal.addItems(new Coke());
        return pieMeal;
    }

    @Override
    public Meal BurgerMeal() {
        Meal burgerMeal = new Meal();
        burgerMeal.addItems(new Burger());
        burgerMeal.addItems(new Coke());
        return burgerMeal;
    }
}

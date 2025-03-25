package com.design.BuilderPattern;

public class Director {
    public static void main(String[] args){
        MealBuilder mealBuilder = new MealBuilder();
        Meal pieMeal = mealBuilder.PieMeal();
        Meal burgerMeal = mealBuilder.BurgerMeal();
        System.out.println(pieMeal.getCost());
        System.out.println(burgerMeal.getCost());
    }
}

package com.design.BuilderPattern;

import com.design.BuilderPattern.Meal;

public interface Builder {
    Meal PieMeal();
    Meal BurgerMeal();
}

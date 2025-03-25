package com.design.AbstractFactory;

import com.design.Color;

public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Blue filled");
    }
}

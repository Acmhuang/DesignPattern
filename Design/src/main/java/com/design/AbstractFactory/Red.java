package com.design.AbstractFactory;

import com.design.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Red filled");
    }
}

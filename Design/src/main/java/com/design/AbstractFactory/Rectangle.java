package com.design.AbstractFactory;

import com.design.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle drew");
    }
}

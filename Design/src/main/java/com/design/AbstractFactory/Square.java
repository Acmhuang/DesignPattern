package com.design.AbstractFactory;

import com.design.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square drew");
    }
}

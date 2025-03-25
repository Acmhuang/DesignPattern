package com.design.AbstractFactory;

import com.design.Color;
import com.design.Shape;

public class AbstractFactoryDemo {
    public static void main(String[] args){
        ColorFactory colorFactory = new ColorFactory();
        ShapeFactory shapeFactory = new ShapeFactory();
        Color blue = colorFactory.getColor("Blue");
        Color red = colorFactory.getColor("Red");
        Shape rectangle = shapeFactory.getShape("Rectangle");
        Shape square = shapeFactory.getShape("Square");
        blue.fill();
        red.fill();
        rectangle.draw();
        square.draw();
    }
}

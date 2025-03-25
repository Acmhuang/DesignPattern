package com.design.AbstractFactory;

import com.design.Color;
import com.design.Shape;

public class ColorFactory extends AbstractFactory{
    @Override
    public Shape getShape(String name) {
        return null;
    }

    @Override
    public Color getColor(String name) {
        if(name == null) return null;
        if(name.equalsIgnoreCase("red"))
            return new Red();
        else if(name.equalsIgnoreCase("blue"))
            return new Blue();
        return null;
    }
}

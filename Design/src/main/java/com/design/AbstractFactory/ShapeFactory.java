package com.design.AbstractFactory;

import com.design.Color;
import com.design.Shape;

public class ShapeFactory extends AbstractFactory{

    @Override
    //方法签名包括方法名、参数类型和返回类型，不包括参数名。
    //子类在重写父类方法时，可以更改参数名，只要方法签名一致即可。
    public Shape getShape(String name) {
        if(name == null) return null;
        if(name.equalsIgnoreCase("rectangle"))
            return new Rectangle();
        else if(name.equalsIgnoreCase("Square"))
            return new Square();
        return null;
    }

    @Override
    public Color getColor(String name) {
        return null;
    }
}

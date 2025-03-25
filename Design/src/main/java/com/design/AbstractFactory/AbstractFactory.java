package com.design.AbstractFactory;

import com.design.Color;
import com.design.Shape;

public abstract class AbstractFactory {
    //方法签名包括方法名、参数类型和返回类型，不包括参数名。
    //子类在重写父类方法时，可以更改参数名，只要方法签名一致即可。
    public abstract Shape getShape(String shapeType);
    public abstract Color getColor(String colorType);
}

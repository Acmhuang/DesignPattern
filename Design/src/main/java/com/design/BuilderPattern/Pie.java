package com.design.BuilderPattern;

public class Pie implements Item {
    @Override
    public String name() {
        return "Pie";
    }

    @Override
    public float price() {
        return 40.0f;
    }
}

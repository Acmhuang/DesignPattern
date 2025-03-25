package com.design.BuilderPattern;

public class Burger implements Item {
    @Override
    public String name() {
        return "Burger";
    }

    @Override
    public float price() {
        return 55.0f;
    }
}

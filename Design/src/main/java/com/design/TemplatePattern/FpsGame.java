package com.design.TemplatePattern;

public class FpsGame extends Game{
    @Override
    void initialize() {
        System.out.println("Fps game initializing");
    }

    @Override
    void playing() {
        System.out.println("playing Fps game");
    }

    @Override
    void end() {
        System.out.println("ending Fps game");
    }
}

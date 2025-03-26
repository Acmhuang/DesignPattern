package com.design.TemplatePattern;

public class MobaGame extends Game{
    @Override
    void initialize() {
        System.out.println("initializing Moba game");
    }

    @Override
    void playing() {
        System.out.println("playing Moba game");
    }

    @Override
    void end() {
        System.out.println("ending Moba game");
    }
}

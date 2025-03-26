package com.design.TemplatePattern;

public abstract class Game {
    abstract void initialize();
    abstract void playing();
    abstract void end();
    public final void play(){
     initialize();
     playing();
     end();
    }
}

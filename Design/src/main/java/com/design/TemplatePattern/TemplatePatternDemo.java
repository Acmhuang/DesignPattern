package com.design.TemplatePattern;

public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new FpsGame();
        game.play();
        game = new MobaGame();
        game.play();
    }
}

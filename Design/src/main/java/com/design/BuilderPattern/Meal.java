package com.design.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();
    public void addItems(Item item){
        items.add(item);
    }
    public float getCost() {
        float cost = 0;
        for (Item item : items) {
            cost+= item.price();
        }
        return cost;
    }
}

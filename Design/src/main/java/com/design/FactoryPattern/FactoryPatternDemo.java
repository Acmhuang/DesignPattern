package com.design.FactoryPattern;

import com.design.Person;

public class FactoryPatternDemo {
    public static void main(String[] args){
        PersonFactory personFactory = new PersonFactory();
        Person morty = personFactory.getPerson("Morty");
        Person rick = personFactory.getPerson("Rick");
        morty.yield();
        rick.yield();
    }
}

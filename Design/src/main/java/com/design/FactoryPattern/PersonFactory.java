package com.design.FactoryPattern;

import com.design.Person;

public class PersonFactory {
    public Person getPerson(String name){
        if(name == null) return null;
        if (name.equalsIgnoreCase("Rick"))
            return new Rick();
        else if(name.equalsIgnoreCase("Morty"))
            return new Morty();
        return null;
    }
}

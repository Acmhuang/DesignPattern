package com.design.Singleton;

public class Lazy_Safe {
    private static Lazy_Safe instance;
    private Lazy_Safe(){}
    public static synchronized Lazy_Safe getInstance(){
        if (instance == null){
            instance = new Lazy_Safe();
        }
        return instance;
    }
}

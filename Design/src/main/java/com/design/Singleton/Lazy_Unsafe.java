package com.design.Singleton;

public class Lazy_Unsafe {
    private static Lazy_Unsafe instance;
    //通过私有化构造方法。使该类无法被实例化
    private Lazy_Unsafe(){}
    private Lazy_Unsafe getInstance(){
        if(instance == null){
            instance = new Lazy_Unsafe();
        }
        return instance;
    }
}

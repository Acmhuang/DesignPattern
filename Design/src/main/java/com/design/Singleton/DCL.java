package com.design.Singleton;

public class DCL {
    //lazy 双锁
    private volatile static DCL instance;
    private DCL(){}
    public static DCL getInstance(){
        if(instance == null){
            synchronized (DCL.class){
                if(instance == null){
                    instance = new DCL();
                }
            }
        }
        return instance;
    }
}

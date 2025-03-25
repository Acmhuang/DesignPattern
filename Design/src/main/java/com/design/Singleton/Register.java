package com.design.Singleton;

public class Register {
    private static class InstanceHolder{
        private static final Register instance = new Register();
    }
    private Register(){}
    public static final Register getInstance(){
        return InstanceHolder.instance;
    }
}

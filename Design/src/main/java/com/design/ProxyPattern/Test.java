package com.design.ProxyPattern;

public class Test {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        UserProxy userProxy = new UserProxy(userDao);
        userProxy.save();
    }
}

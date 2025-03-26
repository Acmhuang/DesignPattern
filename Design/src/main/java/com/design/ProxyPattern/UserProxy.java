package com.design.ProxyPattern;

public class UserProxy extends UserDao{
    private UserDao userDao;
    public UserProxy(UserDao userDao){
        this.userDao = userDao;
    }
    @Override
    public void save(){
        System.out.println("Transaction activating");
        userDao.save();
        System.out.println("Transaction closing");
    }
}

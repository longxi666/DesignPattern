package com.dragon.create.singleton.hungry;

public class client {

    public static void main(String[] args) {
        Singleton3 instance = Singleton3.INSTANCE;
        Singleton3 instance1 = Singleton3.INSTANCE;
        //验证是否为单例
        System.out.println(instance == instance1);

    }
}

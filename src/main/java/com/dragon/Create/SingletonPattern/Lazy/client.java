package com.dragon.Create.SingletonPattern.Lazy;

public class client {

    public static void main(String[] args) {

        Singleton3 instance = Singleton3.getInstance();
        Singleton3 instance1 = Singleton3.getInstance();
        //验证是否为单例
        System.out.println(instance == instance1);


    }
}

package com.dragon.create.singleton.lazy;

/**
 * TODO 懒汉式: 线程安全版 -- 使用synchronized
 */
public class Singleton1 {

    //私有构造方法
    private Singleton1(){}

    //声明当前类对象
    public static Singleton1 singleton;

    //对外提供访问方式
    public static synchronized Singleton1 getInstance(){
        //判断是否为null
        if(singleton == null){
            //不使用Synchronized 会导致线程不安全 -- A、B 线程同时进入创造对象
            singleton = new Singleton1();
        }
        return singleton;
    }
}

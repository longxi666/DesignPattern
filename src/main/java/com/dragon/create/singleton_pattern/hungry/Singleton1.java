package com.dragon.create.singleton_pattern.hungry;

/**
 * TODO 饿汉式：静态成员变量
 */
public class Singleton1 {

    //私有构造方法
    private Singleton1(){}

    //在本类中创建该类
    private static Singleton1 singleton1 = new Singleton1();/*  Static  */

    //提供公共访问方式，使外界获取对象
    public static Singleton1 getInstance(){
        return singleton1;

    }
}
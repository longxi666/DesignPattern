package com.dragon.Create.SingletonPattern.Hungry;

/**
 * TODO 饿汉式：静态代码块
 */
public class Singleton2 {

    //私有构造方法
    private Singleton2(){}

    //声明Singleton 类型变量
    private static Singleton2 singleton;/*  Static  */

    //在静态代码块中进行赋值
    static {
        singleton = new Singleton2();
    }

    //提供公共访问方式，使外界获取对象
    public static Singleton2 getInstance(){
        return singleton;
    }
}

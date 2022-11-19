package com.dragon.create.singleton.lazy;

/**
 * TODO 懒汉式: 静态内部类
 */
public class Singleton3 {

    //私有构造方法
    private Singleton3() {}

    //定义静态内部类
    private static class SingletonHolder{
        //在定义类中声明并初始化外部类对象
        private static final Singleton3 singleton = new Singleton3();

    }

    //对外提供访问方式
    public static synchronized Singleton3 getInstance() {
        return SingletonHolder.singleton;
    }
}
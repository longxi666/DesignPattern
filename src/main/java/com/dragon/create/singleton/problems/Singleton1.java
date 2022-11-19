package com.dragon.create.singleton.problems;

/**
 * TODO 问题：序列化反序列化破坏单例模式 -- readResolve()方法
 */
public class Singleton1 {

    //私有构造方法
    private Singleton1(){}

    private static class SingletonHolder{
        private static final Singleton1 INSTANCE = new Singleton1();
    }

    //对外提供静态方法获取该类对象
    public static synchronized Singleton1 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * 解决序列化和反序列化破坏单例模式 *
     *
     * 进行序列化和反序列化时自动调用该方法，返回该方法的返回值
     * 源码见 ObjectInputStream类中
     */
    private Object readResolve(){
        return SingletonHolder.INSTANCE;
    }
}

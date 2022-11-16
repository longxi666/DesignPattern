package com.dragon.create.singleton_pattern.lazy;

/**
 * TODO 懒汉式: 双重检查锁 -- 使用volatile
 */
public class Singleton2 {

    //私有构造方法
    private Singleton2() {}

    //声明当前类对象
    public static volatile Singleton2 singleton;//volat 保证指令有序

    //对外提供访问方式
    public static synchronized Singleton2 getInstance() {
        //第一次判断,如果singleton 不为空 则直接返回对象而不用抢占锁
        if (singleton == null) {
            synchronized (Singleton2.class) {
                //第二次判断
                if (singleton == null) {
                    singleton = new Singleton2();
                }
            }
        }
        return singleton;
    }
}
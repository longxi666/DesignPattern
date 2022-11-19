package com.dragon.create.singleton.problems;

/**
 * TODO 问题：反射破坏单例模式 -- RunTimeException
 */
public class Singleton2 {

    //私有构造方法
    private Singleton2() {
        /*
            使用此代码防止问题出现
         */
        if (singleton != null) {
            throw new RuntimeException("不允许多次创造对象");
        }
    }

    private static volatile Singleton2 singleton;

    //对外提供静态方法获取对象
    public static Singleton2 getInstance() {
        if (singleton != null) {
            return singleton;
        }

        synchronized (Singleton2.class) {
            if (singleton != null) {
                return singleton;
            }
            singleton = new Singleton2();
            return singleton;
        }
    }

}

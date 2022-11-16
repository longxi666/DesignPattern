package com.dragon.create.factory_pattern.before;

/**
 * 咖啡类
 */
public abstract class Coffee {

    public abstract  String getName();
    //加糖
    public void addSugar(){
        System.out.println("Sugar!");
    }
    //加奶
    public void addMilk(){
        System.out.println("Milk!");
    }
}

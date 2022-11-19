package com.dragon.create.builder.normal;

/**
 * TODO 抽象构建者
 */
public abstract class Builder {

    /**声明Bike 类的变量,并进行赋值*/
    protected Bike bike = new Bike();

    public abstract void builderFrame();//构建车架
    public abstract void builderSeat();//构建座位
    public abstract Bike creatBike();//构建自行车方法
}

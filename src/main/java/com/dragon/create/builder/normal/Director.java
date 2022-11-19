package com.dragon.create.builder.normal;

/**
 * TODO 建造指挥者类
 */
public class Director {

    //声明builder 类型变量
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    //组装自行车
    public Bike construct(){
        builder.builderFrame();
        builder.builderSeat();
        return builder.creatBike();
    }
}

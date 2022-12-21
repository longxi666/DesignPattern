package com.dragon.constructon.flyweight;

/**
 *  TODO 抽象享元角色
 */
public abstract class AbstractBox {

    //获取图形的方法
    public abstract String getShape();

    //显示图形及颜色
    public void display(String color){
        System.out.println("图形形状为：" + getShape() + " ，颜色为：" + color);
    }

}
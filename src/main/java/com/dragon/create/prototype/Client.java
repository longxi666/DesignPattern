package com.dragon.create.prototype;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        //创建一个原型类对象
        Realizetype realizetype = new Realizetype();
        //调用方法进行克隆
        Realizetype clone = realizetype.clone();
        System.out.println("是否为同一个对象:" + (realizetype == clone));
    }
}

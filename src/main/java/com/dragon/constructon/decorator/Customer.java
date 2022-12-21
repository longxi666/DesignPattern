package com.dragon.constructon.decorator;

public class Customer {
    public static void main(String[] args) {

        FastFood rice = new FriedRice();
        System.out.println(rice.getDesc() + "，价格：" + rice.cost());

        //炒饭加个蛋
        rice = new Egg(rice);
        System.out.println(rice.getDesc() + "，价格：" + rice.cost());

        //炒饭加个蛋
        rice = new Egg(rice);
        System.out.println(rice.getDesc() + "，价格：" + rice.cost());

        //炒饭加个培根
        rice = new Bacon(rice);
        System.out.println(rice.getDesc() + "，价格：" + rice.cost());
    }
}

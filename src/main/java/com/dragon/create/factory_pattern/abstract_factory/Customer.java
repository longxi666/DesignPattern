package com.dragon.create.factory_pattern.abstract_factory;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * 顾客
 */
public class Customer {
    public static void main(String[] args) {
        System.out.println("意式：==================================");
        //创建意式工厂
        ItalianDessertFactory factory = new ItalianDessertFactory();
        Dessert dessert = factory.creatDessert();
        Coffee coffee = factory.creatCoffee();
        dessert.show();
        coffee.addMilk();
        coffee.addSugar();
        System.out.println(coffee.getName());
        System.out.println("美式：==================================");

        //创建美式工厂
        AmericanDessertFactory factory1 = new AmericanDessertFactory();
        Dessert dessert1 = factory1.creatDessert();
        Coffee coffee1 = factory1.creatCoffee();
        dessert1.show();
        coffee1.addMilk();
        coffee1.addSugar();
        System.out.println(coffee1.getName());

    }
}

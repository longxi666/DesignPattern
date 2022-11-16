package com.dragon.create.factory_pattern.simple_factory_config;

public class Customer {
    public static void main(String[] args) {
        //传入的名称与Properties 中一致
        Coffee coffee = CoffeeFactory.creatCoffee("latteCoffee");
        coffee.addMilk();
        coffee.addSugar();
        System.out.println(coffee.getName());

        System.out.println("-----------------------------------");

        coffee = CoffeeFactory.creatCoffee("americanCoffee");
        coffee.addMilk();
        coffee.addSugar();
        System.out.println(coffee.getName());

    }
}

package com.dragon.create.factory.static_factory;

public class Customer {
    public static void main(String[] args) {
        //顾客进店
        CoffeeStore store = new CoffeeStore();
        //顾客点餐
        Coffee americanCoffee = store.orderCoffee("AmericanCoffee");
        System.out.println(americanCoffee.getName());

        Coffee coke = store.orderCoffee("Coke");
        System.out.println(coke.getName());

    }
}

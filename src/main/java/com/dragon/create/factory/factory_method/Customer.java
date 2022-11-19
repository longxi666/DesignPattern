package com.dragon.create.factory.factory_method;

public class Customer {
    public static void main(String[] args) {
        //创建咖啡店
        CoffeeStore store = new CoffeeStore();
        //创建工厂
        /*
        CoffeeFactory factory = new AmericanCoffeeFactory();*/
        CoffeeFactory factory = new LatteCoffeeFactory();
        store.setFactory(factory);

        //点咖啡
        Coffee coffee = store.orderCoffee();

        System.out.println(coffee.getName());
    }
}

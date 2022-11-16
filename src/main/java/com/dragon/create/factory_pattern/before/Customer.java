package com.dragon.create.factory_pattern.before;

public class Customer {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();

        Coffee americanCoffee = coffeeStore.orderCoffee("AmericanCoffee");
        System.out.println(americanCoffee.getName());

        Coffee latteCoffee = coffeeStore.orderCoffee("LatteCoffee");
        System.out.println(latteCoffee.getName());

        Coffee coke = coffeeStore.orderCoffee("Coke");
        System.out.println(coke.getName());
    }
}

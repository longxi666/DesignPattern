package com.dragon.create.factory_pattern.factory_method;

/**
 * 美式咖啡工厂
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee creatCoffee() {
        return new AmericanCoffee();
    }
}

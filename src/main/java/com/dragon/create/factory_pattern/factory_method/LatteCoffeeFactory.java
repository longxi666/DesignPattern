package com.dragon.create.factory_pattern.factory_method;

/**
 * 拿铁咖啡工厂
 */
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee creatCoffee() {
        return new LatteCoffee();
    }
}

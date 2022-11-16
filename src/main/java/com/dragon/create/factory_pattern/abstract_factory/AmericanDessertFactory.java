package com.dragon.create.factory_pattern.abstract_factory;

/**
 * 美式口味工厂
 */
public class AmericanDessertFactory implements DessertFactory{
    @Override
    public Coffee creatCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert creatDessert() {
        return new MatchaMousse();
    }
}

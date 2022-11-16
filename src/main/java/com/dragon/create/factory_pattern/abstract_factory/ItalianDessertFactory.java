package com.dragon.create.factory_pattern.abstract_factory;

/**
 * 意式口味工厂
 */
public class ItalianDessertFactory implements DessertFactory{
    @Override
    public Coffee creatCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert creatDessert() {
        return new Tiramisu();
    }
}

package com.dragon.create.factory.abstract_factory;

/**
 * TODO 甜品抽象工厂
 */
public interface DessertFactory {

    //生产咖啡
    Coffee creatCoffee();

    //生产甜品
    Dessert creatDessert();
}

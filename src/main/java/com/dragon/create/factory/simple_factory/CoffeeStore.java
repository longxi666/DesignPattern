package com.dragon.create.factory.simple_factory;

/*
 * 咖啡店
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type){
        //新建工厂
        CoffeeSimpleFactory coffeeSimpleFactory = new CoffeeSimpleFactory();
        //调用工厂生产咖啡
        Coffee coffee = coffeeSimpleFactory.creatCoffee(type);
        //加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}

package com.dragon.create.factory_pattern.static_factory;

/*
 * 咖啡店
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type){

        //无需新建工厂
        //CoffeeSimpleFactory coffeeSimpleFactory = new CoffeeSimpleFactory();

        //直接调用工厂生产咖啡
        Coffee coffee = CoffeeSimpleFactory.creatCoffee(type);

        //加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}

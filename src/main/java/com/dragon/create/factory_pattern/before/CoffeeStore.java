package com.dragon.create.factory_pattern.before;

/**
 * TODO 原始咖啡店 -- 引子
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type){
        Coffee coffee = null;
        if("AmericanCoffee".equals(type)){
            coffee = new AmericanCoffee();
        }else if("LatteCoffee".equals(type)){
            coffee = new LatteCoffee();
        }else {
            throw new RuntimeException("本店不卖这个！");
        }

        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}

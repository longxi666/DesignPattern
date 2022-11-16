package com.dragon.create.factory_pattern.static_factory;

/**
 * TODO 咖啡静态工厂
 */
public class CoffeeSimpleFactory {

    public static Coffee creatCoffee(String type){
        Coffee coffee = null;
        if("AmericanCoffee".equals(type)){
            coffee = new AmericanCoffee();
        }else if("LatteCoffee".equals(type)){
            coffee = new LatteCoffee();
        }else {
            throw new RuntimeException("本店不卖这个！");
        }
        
        return coffee;
    }

}

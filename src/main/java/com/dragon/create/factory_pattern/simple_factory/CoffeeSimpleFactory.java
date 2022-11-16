package com.dragon.create.factory_pattern.simple_factory;

/**
 * TODO 咖啡简单工厂
 */
public class CoffeeSimpleFactory {

    public Coffee creatCoffee(String type){
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

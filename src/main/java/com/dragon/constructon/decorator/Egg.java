package com.dragon.constructon.decorator;

/**
 * TODO 具体的装饰者类 -- 鸡蛋
 */
public class Egg extends Garnish{

    public Egg(FastFood fastFood){
        super(fastFood, 1F, "加个蛋的");
    }

    @Override
    public float cost() {
        //算价
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}

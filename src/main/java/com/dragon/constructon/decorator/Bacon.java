package com.dragon.constructon.decorator;

/**
 * TODO 具体的装饰者类 -- 培根
 */
public class Bacon extends Garnish{

    public Bacon(FastFood fastFood){
        super(fastFood, 2F, "加个培根的");
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

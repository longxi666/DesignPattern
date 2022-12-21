package com.dragon.constructon.decorator;

/**
 * TODO 具体构件角色 -- 炒面
 */
public class FriedNoodles extends FastFood{

    public FriedNoodles() {
        super(8,"一般炒面");
    }

    public FriedNoodles(float price, String desc) {
        super(price, desc);
    }

    @Override
    public float cost() {
        return getPrice();
    }
}

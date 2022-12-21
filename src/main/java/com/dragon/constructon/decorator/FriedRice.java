package com.dragon.constructon.decorator;

/**
 * TODO 具体构件角色 -- 炒饭
 */
public class FriedRice extends FastFood{
    public FriedRice() {
        super(9,"一般炒饭");
    }

    public FriedRice(float price, String desc) {
        super(price, desc);
    }

    @Override
    public float cost() {
        return getPrice();
    }

}

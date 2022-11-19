package com.dragon.create.builder.normal;

/**
 * TODO 具体的构建者，用于构建OfoBike 单车
 */
public class OfoBuilder extends Builder{
    @Override
    public void builderFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void builderSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike creatBike() {
        return bike;
    }
}

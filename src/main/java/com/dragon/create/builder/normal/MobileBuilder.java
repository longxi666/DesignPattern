package com.dragon.create.builder.normal;

/**
 * TODO 具体的构建者，用于构建MobileBike 对象
 */
public class MobileBuilder extends Builder{

    @Override
    public void builderFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void builderSeat() {
        bike.setSeat("真皮沙发坐垫");
    }

    @Override
    public Bike creatBike() {
        return bike;
    }
}

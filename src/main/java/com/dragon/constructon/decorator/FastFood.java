package com.dragon.constructon.decorator;

/**
 * TODO 抽象构建角色 -- 快餐类
 */
public abstract class FastFood {
    public float price;//价格
    public String desc;//描述

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }
    public FastFood() {
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract float cost();
}

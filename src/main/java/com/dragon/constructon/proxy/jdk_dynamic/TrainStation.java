package com.dragon.constructon.proxy.jdk_dynamic;

/**
 * TODO 具体主题类 -- 火车站
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票 - jdk");
    }

    @Override
    public void sellWater() {
        System.out.println("水");
    }
}

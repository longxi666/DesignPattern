package com.dragon.constructon.proxy.static_;

/**
 * TODO 具体主题类 -- 火车站
 */
public class TrainStation implements SellTickets{
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}

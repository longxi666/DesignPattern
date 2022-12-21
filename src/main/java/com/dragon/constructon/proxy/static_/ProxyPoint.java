package com.dragon.constructon.proxy.static_;

/**
 * TODO 代理类 -- 代售点
 */
public class ProxyPoint implements SellTickets{
    //声明真实主题类对象 -- 火车站
    private TrainStation station = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代售点收取服务费用：");
        station.sell();
    }
}

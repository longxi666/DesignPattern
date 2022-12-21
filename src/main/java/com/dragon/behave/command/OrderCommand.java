package com.dragon.behave.command;

import java.util.Map;
import java.util.Set;

/**
 * @date 2022/11/26 10:29
 * TODO 具体命令类
 */
public class OrderCommand implements Command{
    //持有接收者对象
    private Cook cook;
    private Order order;

    public OrderCommand(Cook cook, Order order) {
        this.cook = cook;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getTableNumber() + "的订单：");
        Map<String, Integer> foodDir = order.getFoodDir();
        Set<String> keys = foodDir.keySet();
        for (String foodName : keys) {
            cook.makeFood(foodName ,foodDir.get(foodName));
        }

        System.out.println(order.getTableNumber() + "号桌的订单已完成，待上菜");
    }
}
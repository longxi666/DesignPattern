package com.dragon.behave.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @date 2022/11/26 10:22
 * TODO 订单类
 */
public class Order {

    private int tableNumber;
    private Map<String ,Integer> foodDir = new HashMap<String ,Integer>();

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    /*  修改过   */
    public void setFood(String name ,int num) {
        foodDir.put(name ,num);
    }
}

package com.dragon.behave.strategy;

/**
 * @date 2022/11/25 9:33
 * TODO 具体策略类,封装算法
 */
public class StrategyC implements Strategy{

    @Override
    public void show() {
        System.out.println("满1K加一元换购任意200元以下商品！");
    }
}

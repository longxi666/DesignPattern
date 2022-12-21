package com.dragon.behave.strategy;

/**
 * @date 2022/11/25 9:33
 * TODO 具体策略类,封装算法
 */
public class StrategyA implements Strategy{

    @Override
    public void show() {
        System.out.println("买一送一！");
    }
}

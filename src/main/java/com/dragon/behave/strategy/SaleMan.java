package com.dragon.behave.strategy;

/**
 * @date 2022/11/25 9:35
 * TODO 环境类 -- 销售员
 */
public class SaleMan {

    //聚合策略类
    private Strategy strategy;

    public SaleMan(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void SaleManShow(){
        strategy.show();
    }
}

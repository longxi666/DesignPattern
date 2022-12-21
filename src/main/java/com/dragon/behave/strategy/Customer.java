package com.dragon.behave.strategy;

/**
 * @date 2022/11/25 9:37
 *
 */
public class Customer {
    public static void main(String[] args) {

        //A节来了，使用A节促销活动
        SaleMan saleMan1 = new SaleMan(new StrategyA());
        saleMan1.SaleManShow();
        //B节来了，使用B节促销活动
        SaleMan saleMan2 = new SaleMan(new StrategyB());
        saleMan2.SaleManShow();
        //C节来了，使用C节促销活动
        SaleMan saleMan3 = new SaleMan(new StrategyC());
        saleMan3.SaleManShow();
    }
}

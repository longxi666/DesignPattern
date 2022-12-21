package com.dragon.behave.template_method;

/**
 * @date 2022/11/24 19:30
 * TODO 抽象类 -- 炒菜
 */
public abstract class AbstractClass {

    //模板方法
    public final void cookProcess(){//定义为final 无法被重写
        pourOil();
        heat();
        put();
        addSauce();
        fry();
    }

    public void pourOil() {//基本方法
        System.out.println("热锅加油！");
    }

    public void heat() {//基本方法
        System.out.println("大火热油！");
    }

    public abstract void put();//抽象方法

    public abstract void addSauce();//抽象方法

    public void fry() {//基本方法
        System.out.println("爆炒！");
    }

    //钩子方法
}

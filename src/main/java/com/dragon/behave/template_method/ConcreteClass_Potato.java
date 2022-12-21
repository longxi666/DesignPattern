package com.dragon.behave.template_method;

/**
 * @date 2022/11/24 19:35
 * TODO 具体类 -- 炒土豆
 */
public class ConcreteClass_Potato extends AbstractClass{
    @Override
    public void put() {
        System.out.println("放Potato");
    }

    @Override
    public void addSauce() {
        System.out.println("放Vinegar");
    }
}

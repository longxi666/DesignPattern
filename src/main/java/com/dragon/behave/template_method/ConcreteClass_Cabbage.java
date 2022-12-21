package com.dragon.behave.template_method;

/**
 * @date 2022/11/24 19:35
 * TODO 具体类 -- 炒包菜
 */
public class ConcreteClass_Cabbage extends AbstractClass{
    @Override
    public void put() {
        System.out.println("放Cabbage");
    }

    @Override
    public void addSauce() {
        System.out.println("放Chili");
    }
}

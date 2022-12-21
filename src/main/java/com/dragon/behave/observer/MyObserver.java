package com.dragon.behave.observer;

/**
 * @date 2022/11/30 13:15
 * TODO 具体观察者角色类
 */
public class MyObserver implements Observer{

    private String name;

    public MyObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println(msg + " " +name + "：收到！");
    }
}

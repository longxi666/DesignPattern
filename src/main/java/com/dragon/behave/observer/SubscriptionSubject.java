package com.dragon.behave.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2022/11/30 13:11
 * TODO 具体主题角色类
 */
public class SubscriptionSubject implements Subject{

    //定义一个集合用来存储观察者对象
    private List<Observer> userList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        userList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        userList.remove(observer);
    }

    @Override
    public void notify(String msg) {
        //遍历集合
        for (Observer observer : userList) {
            observer.update(msg);
        }
    }
}

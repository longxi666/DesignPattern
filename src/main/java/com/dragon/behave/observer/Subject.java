package com.dragon.behave.observer;

/**
 * @date 2022/11/30 13:08
 * TODO 抽象主题角色类
 */
public interface Subject {

    //添加订阅者
    void attach(Observer observer);

    //删除订阅者
    void detach(Observer observer);

    //通知订阅者更新
    void notify(String msg);

}

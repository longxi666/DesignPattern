package com.dragon.behave.visitor;

/**
 * @date 2022/12/2 10:38
 * TODO 抽象元素角色类
 */
public interface Animal {

    //接收访问者访问
    void accept(Person person);
}

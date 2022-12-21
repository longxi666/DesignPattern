package com.dragon.behave.visitor;

/**
 * @date 2022/12/2 10:36
 * TODO 抽象访问者角色类
 */
public interface Person {

    void feed(Cat cat);
    void feed(Dog dog);

}

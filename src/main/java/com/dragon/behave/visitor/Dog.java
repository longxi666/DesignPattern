package com.dragon.behave.visitor;

/**
 * @date 2022/12/2 10:38
 * TODO 具体元素角色类
 */
public class Dog implements Animal{

    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("狗狗吃饭");
    }
}

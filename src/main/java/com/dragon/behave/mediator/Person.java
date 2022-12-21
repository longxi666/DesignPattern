package com.dragon.behave.mediator;

/**
 * @date 2022/12/1 14:15
 * TODO 抽象同事类
 */
public abstract class Person {
    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

}

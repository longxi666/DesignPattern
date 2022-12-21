package com.dragon.behave.visitor;

/**
 * @date 2022/12/2 10:41
 * TODO 具体访问者角色类
 */
public class Others implements Person{
    @Override
    public void feed(Cat cat) {
        System.out.println("外人呼叫猫猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("外人呼叫狗狗");
    }
}

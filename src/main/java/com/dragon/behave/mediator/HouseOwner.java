package com.dragon.behave.mediator;

/**
 * @date 2022/12/1 14:19
 * TODO 具体的同事类 -- 房东
 */
public class HouseOwner extends Person{

    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    //和中介沟通
    public void contact(String msg){
        System.out.print("找到中介：");
        mediator.contact(msg ,this);
    }

    //获取信息
    public void getMsg(String msg){
        System.out.println("房东" + name + "获取到的信息是：" + msg);
    }
}

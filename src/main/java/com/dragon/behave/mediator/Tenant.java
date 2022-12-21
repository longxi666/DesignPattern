package com.dragon.behave.mediator;

/**
 * @date 2022/12/1 14:16
 * TODO 具体同事类 -- 租客
 */
public class Tenant extends Person{

    public Tenant(String name ,Mediator mediator){
        super(name, mediator);
    }

    //和中介沟通
    public void contact(String msg){
        System.out.print("找到中介：");
        mediator.contact(msg ,this);
    }

    //获取信息
    public void getMsg(String msg){
        System.out.println("租房者" + name + "获取到的信息是：" + msg);
    }

}

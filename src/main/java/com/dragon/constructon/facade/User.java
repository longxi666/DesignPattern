package com.dragon.constructon.facade;

public class User {
    public static void main(String[] args) {
        //创建外观类
        SmartAppliancesFacade facade = new SmartAppliancesFacade();
        facade.say("打开");
        System.out.println();
        facade.say("关闭");
        System.out.println();
        facade.say("睡觉");
    }
}

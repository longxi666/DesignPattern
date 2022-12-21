package com.dragon.constructon.facade;

/**
 * TODO 外观类 -- 用户主要交互对象
 */
public class SmartAppliancesFacade {

    private Light light;
    private AirCondition ac;
    private TV tv;

    public SmartAppliancesFacade() {
        light = new Light();
        ac = new AirCondition();
        tv = new TV();
    }

    //通过语音控制
    public void say (String msg){
        if (msg.contains("打开")) {
            on();
        } else if(msg.contains("关闭")){
            off();
        } else {
            System.out.println("听不懂");
        }
    }

    //一键打开
    private void on(){
        light.on();
        ac.on();
        tv.on();
    }
    //一键关闭
    private void off(){
        light.off();
        ac.off();
        tv.off();
    }
}

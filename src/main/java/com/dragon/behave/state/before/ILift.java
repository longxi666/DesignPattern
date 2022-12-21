package com.dragon.behave.state.before;

/**
 * @date 2022/11/29 10:33
 * TODO 电梯接口
 */
public interface ILift {

    //定义四个状态常量
    int OPENING_STATE = 1;
    int CLOSING_STATE = 2 ;
    int RUNNING_STATE = 3 ;
    int STOPPING_STATE = 4 ;

    //设置电梯状态
    void setState(int state);

    //电梯操作功能
    void open ();
    void stop();
    void close();
    void run();
}

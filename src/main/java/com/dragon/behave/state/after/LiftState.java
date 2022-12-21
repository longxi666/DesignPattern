package com.dragon.behave.state.after;

/**
 * @date 2022/11/29 10:56
 * TODO 抽象状态类
 */
public abstract class LiftState {

    //环境角色类变量
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    //开操作
    public abstract void open();
    //关操作
    public abstract void close();
    //运行操作
    public abstract void run();
    //停止操作
    public abstract void stop();
}

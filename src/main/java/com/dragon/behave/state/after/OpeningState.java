package com.dragon.behave.state.after;

/**
 * @date 2022/11/29 11:01
 * TODO 电梯开启状态类
 */
public class OpeningState extends LiftState {
    @Override
    public void open() {
        System.out.println("电梯开启...");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.CLOSING_STATE);
        super.context.close();
    }

    @Override
    public void run() {
        //什么都不做
    }

    @Override
    public void stop() {
        //什么都不做
    }
}

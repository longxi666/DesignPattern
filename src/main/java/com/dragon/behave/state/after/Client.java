package com.dragon.behave.state.after;

/**
 * @date 2022/11/29 11:24
 * TODO 客户端类
 *
 */
public class Client {
    public static void main(String[] args) {
        //创建环境角色对象
        Context context = new Context();
        //设置当前电梯状态
        context.setLiftState(new ClosingState());

        context.open();
        context.close();
        context.run();
        context.stop();
    }
}

package com.dragon.behave.responsibility;

/**
 * @date 2022/11/28 10:11
 * TODO 具体的处理者类 -- 总经理类
 */
public class GeneralManager extends Handler{

    public GeneralManager() {
        super(Handler.NUM_THREE ,Handler.NUM_SEVEN);
    }

    @Override
    protected void handlerLeave(LeaveRequest request) {
        System.out.println("总经理审批-" + request.getName() + " needs " + request.getNum() + " day(s) off for " + request.getContent());
        System.out.println("总经理同意");
    }
}

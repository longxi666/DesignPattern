package com.dragon.behave.responsibility;

/**
 * @date 2022/11/28 10:11
 * TODO 具体的处理者类 -- 部门经理类
 */
public class Manager extends Handler{

    public Manager(){
        super(Handler.NUM_ONE ,Handler.NUM_THREE);
    }

    @Override
    protected void handlerLeave(LeaveRequest request) {
        System.out.println("部门经理审批-" + request.getName() + " needs " + request.getNum() + " day(s) off for " + request.getContent());
        System.out.println("部门经理同意");
    }
}

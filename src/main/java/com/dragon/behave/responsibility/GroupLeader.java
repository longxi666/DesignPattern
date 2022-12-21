package com.dragon.behave.responsibility;

import static com.dragon.behave.responsibility.Handler.*;

/**
 * @date 2022/11/28 10:11
 * TODO 具体的处理者类 -- 小组长类
 */
public class GroupLeader extends Handler{

    public GroupLeader(){
        super(0 ,Handler.NUM_ONE);
    }

    @Override
    protected void handlerLeave(LeaveRequest request) {
        System.out.println("小组长审批-" + request.getName() + " needs " + request.getNum() + " day(s) off for " + request.getContent());
        System.out.println("小组长同意");
    }
}

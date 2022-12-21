package com.dragon.behave.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2022/11/26 10:33
 * TODO 请求者角色 -- 服务员类
 */
public class Server {

    //持有多个命令对象
    private List<Command> commands = new ArrayList<>();

    public void setCommand(Command cmd){
        //保存订单
        commands.add(cmd);
    }

    public void orderUp(){
        System.out.println("订单来了！");
        for (Command command : commands) {
            if(command != null){
                command.execute();
            }
        }
    }
}

package com.dragon.behave.command;

/**
 * @date 2022/11/26 10:37
 */
public class Client {

    public static void main(String[] args) {
        //下单
        Order order1 = new Order();
        order1.setTableNumber(1);
        order1.setFood("战斧牛排" ,10);
        order1.setFood("矿泉水" ,10);

        Order order2 = new Order();
        order2.setTableNumber(2);
        order2.setFood("狼牙土豆" ,1);
        order2.setFood("番茄酱" ,1);

        //选厨师
        Cook cook = new Cook();
        //派单
        OrderCommand command1 = new OrderCommand(cook ,order1);
        OrderCommand command2 = new OrderCommand(cook ,order2);

        //服务员
        Server server = new Server();
        server.setCommand(command1);
        server.setCommand(command2);

        //发起命令
        server.orderUp();
    }
}

package com.dragon.behave.responsibility;

/**
 * @date 2022/11/28 10:24
 * TODO
 */
public class Client {
    public static void main(String[] args) {
        //声明领导
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();
        //设置处理链
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        //创建请假条对象
        LeaveRequest request1 = new LeaveRequest("Dragon" ,1 ,"生病了");
        LeaveRequest request2 = new LeaveRequest("Dinosaur" ,5 ,"吃饭");
        LeaveRequest request3 = new LeaveRequest("Hope" ,2 ,"？");
        LeaveRequest request4 = new LeaveRequest("1" ,0 ,"上厕所");
        LeaveRequest request5 = new LeaveRequest("2" ,180 ,"产假");

        //提交假条
        groupLeader.submit(request1);System.out.println();
        groupLeader.submit(request2);System.out.println();
        groupLeader.submit(request3);System.out.println();
        groupLeader.submit(request4);System.out.println();
        groupLeader.submit(request5);


    }
}


package com.dragon.constructon.adapter.object;

public class Client {
    public static void main(String[] args) {
        //创建计算机对象
        Computer computer = new Computer();
        //读取SD 卡中的数据
        System.out.println(computer.readSD(new SDCardImpl()));

        System.out.println("--------------------------------------------------------");

        SDAdapterTF adapterTF = new SDAdapterTF(new TFCardImpl());
        String msg1 = computer.readSD(adapterTF);
        System.out.println(msg1);

    }
}

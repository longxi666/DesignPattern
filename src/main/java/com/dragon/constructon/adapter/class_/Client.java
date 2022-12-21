package com.dragon.constructon.adapter.class_;

public class Client {
    public static void main(String[] args) {
        //创建计算机对象
        Computer computer = new Computer();

        //读取SD 卡
        SDCardImpl sdCard = new SDCardImpl();
        sdCard.writeSD("1");System.out.println();
        System.out.println(computer.readSD(sdCard));System.out.println();
        System.out.println("...................................................");
        //读取TD 卡
        //定义适配器类
        SDAdapterTF adapterTF = new SDAdapterTF();
        adapterTF.writeTF("TF");System.out.println();
        adapterTF.writeSD("SD");System.out.println();
        String msg1 = computer.readSD(adapterTF);System.out.println();
        System.out.println(msg1);
    }
}

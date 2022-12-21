package com.dragon.constructon.bridge;

public class Client {
    public static void main(String[] args) {
        //创建Mac 系统对象
        OperationSystem system = new Mac(new AviFile());
        //使用操作系统播放
        system.playVideo("长津湖之水门桥！");

    }
}

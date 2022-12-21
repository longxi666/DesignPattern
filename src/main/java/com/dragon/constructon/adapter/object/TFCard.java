package com.dragon.constructon.adapter.object;

/**
 * TODO 适配者类的接口
 */
public interface TFCard {
    //读
    String readTF();
    //写
    void writeTF(String msg);
}

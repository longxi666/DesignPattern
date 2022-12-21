package com.dragon.constructon.adapter.object;

/**
 * TODO 适配者类
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        String msg = "TFCard read msg : hello, TFCard!";
        return msg;
    }
    @Override
    public void writeTF(String msg) {
        System.out.println("msg: '" + msg +"' write to TFCard!");
    }
}

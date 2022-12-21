package com.dragon.constructon.adapter.object;

/**
 * TODO 目标类
 */
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        String msg = "SDCard read msg : hello, SDCard!";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("msg: '" + msg +"' write to SDCard!");
    }
}

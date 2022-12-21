package com.dragon.constructon.adapter.class_;

/**
 * TODO 适配器类 -- 类适配器模式
 */
public class SDAdapterTF extends TFCardImpl implements SDCard{
    @Override
    public String readSD() {
        System.out.println("adapter read TFCard :");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write TFCard :");
        writeTF(msg);
    }
}

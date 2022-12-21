package com.dragon.constructon.adapter.object;

/**
 * TODO 适配器类 - 对象适配器模式
 */
public class SDAdapterTF implements SDCard {

    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard){
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read TFCard :");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write TFCard :");
        tfCard.writeTF(msg);
    }
}

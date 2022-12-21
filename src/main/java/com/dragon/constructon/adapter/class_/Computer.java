package com.dragon.constructon.adapter.class_;

public class Computer {

    //从SD 卡中读取数据
    public String readSD(SDCard sdCard){
        if(null == sdCard){
            throw new NullPointerException("SD卡未插入~");
        }
        return sdCard.readSD();
    }
    //从SD 卡中写数据
}

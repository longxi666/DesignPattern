package com.dragon.constructon.bridge;
/**
 * TODO 具体的实现化角色 -- AviFile
 */
public class AviFile implements VideoFile{

    @Override
    public void decode(String fileName) {
        System.out.println("avi视频文件：" + fileName);
    }
}

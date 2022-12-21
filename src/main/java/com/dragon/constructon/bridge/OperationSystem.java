package com.dragon.constructon.bridge;

/**
 * TODO 抽象化角色 -- 抽象的操作系统
 */
public abstract class OperationSystem {

    //声明videoFile 变量
    protected VideoFile videoFile;

    public OperationSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }
    public abstract void playVideo(String fileName);

}

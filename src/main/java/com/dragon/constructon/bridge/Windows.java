package com.dragon.constructon.bridge;

/**
 * TODO 拓展抽象化角色 -- Windows 操作系统
 */
public class Windows extends OperationSystem{

    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void playVideo(String fileName) {
        videoFile.decode(fileName);
    }
}

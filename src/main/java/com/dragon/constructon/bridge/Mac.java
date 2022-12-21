package com.dragon.constructon.bridge;

/**
 * TODO 拓展抽象化角色 -- Mac 操作系统
 */
public class Mac extends OperationSystem{

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void playVideo(String fileName) {
        videoFile.decode(fileName);
    }
}

package com.dragon.behave.state.before;

/**
 * @date 2022/11/29 10:36
 * TODO 电梯类 -- 电梯接口实现类
 */
public class Lift implements ILift{

    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (state){
            case OPENING_STATE:
            case RUNNING_STATE:
                break;
            case CLOSING_STATE:
                System.out.println("在电梯关闭时把电梯门打开了...");
                setState(OPENING_STATE);
                break;
            case STOPPING_STATE:
                System.out.println("在电梯停止时把电梯门打开了...");
                setState(OPENING_STATE);
                break;
        }
    }

    @Override
    public void stop() {
        switch (state) {
            case OPENING_STATE:
            case STOPPING_STATE:
                break;
            case CLOSING_STATE:
                System.out.println("电梯关闭时把电梯停止了...");
                this.setState(STOPPING_STATE);
                break;
            case RUNNING_STATE:
                System.out.println("电梯运行时把电梯停止了...");
                this.setState(STOPPING_STATE);
                break;
        }
    }

    @Override
        public void close() {
            switch (state) {
                case OPENING_STATE:
                    System.out.println("电梯打开时把电梯关门了...");
                    this.setState(CLOSING_STATE);
                    break;
                case CLOSING_STATE:
                case RUNNING_STATE:
                case STOPPING_STATE:
                    break;
            }
        }

        @Override
        public void run() {
            switch (state) {
                case OPENING_STATE:
                case RUNNING_STATE:
                    break;
                case CLOSING_STATE:
                    System.out.println("电梯在关闭时电梯开始运行了...");
                    this.setState(RUNNING_STATE);
                    break;
                case STOPPING_STATE:
                    System.out.println("电梯在停止时电梯开始运行了...");
                    this.setState(RUNNING_STATE);
                    break;
            }
        }
}


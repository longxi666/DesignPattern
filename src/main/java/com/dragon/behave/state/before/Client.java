package com.dragon.behave.state.before;

/**
 * @date 2022/11/29 10:48
 * TODO 乘客类
 */
public class Client {
    public static void main(String[] args) {
        Lift lift = new Lift();

        lift.setState(ILift.OPENING_STATE);

        lift.open();
        lift.close();
        lift.run();
        lift.stop();
    }
}

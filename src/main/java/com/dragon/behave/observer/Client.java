package com.dragon.behave.observer;

/**
 * @date 2022/11/30 13:17
 */
public class Client {
    public static void main(String[] args) {

        SubscriptionSubject subject = new SubscriptionSubject();

        subject.attach(new MyObserver("Dragon"));
        MyObserver observer = new MyObserver("dragon");
        subject.attach(observer);

        subject.notify("代码更新了！");
    }
}

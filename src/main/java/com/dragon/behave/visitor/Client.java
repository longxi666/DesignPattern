package com.dragon.behave.visitor;

/**
 * @date 2022/12/2 10:42
 */
public class Client {
    public static void main(String[] args) {
        Home home = new Home();
        home.add(new Dog());
        home.add(new Cat());

        Owner owner = new Owner();
        Others others = new Others();

        home.action(owner);
        System.out.println();
        home.action(others);


    }
}

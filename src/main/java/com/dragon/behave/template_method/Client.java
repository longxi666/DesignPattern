package com.dragon.behave.template_method;

/**
 * @date 2022/11/24 19:39
 *
 */
public class Client {
    public static void main(String[] args) {

        ConcreteClass_Potato potato = new ConcreteClass_Potato();
        potato.cookProcess();

        System.out.println();

        ConcreteClass_Cabbage cabbage = new ConcreteClass_Cabbage();
        potato.cookProcess();
    }
}

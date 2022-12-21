package com.dragon.constructon.flyweight;

/**
 * @date 2022/11/23 10:25
 */
public class Customer {
    public static void main(String[] args) {
        BoxFactory boxFactory = BoxFactory.gerInstance();

        AbstractBox i = boxFactory.getShape("I");
        i.display("Green");

        AbstractBox o = boxFactory.getShape("O");
        o.display("Pink");

        AbstractBox l = boxFactory.getShape("L");
        l.display("Red");

        AbstractBox l1 = boxFactory.getShape("L");
        l1.display("Blue");

        /*
        非享元角色类 ———— 直接实例化创建
        LBox lBox = new LBox();
        lBox.display("Yellow");
        */

        System.out.println("两个'L'是否为同一个对象" + (l1 == l));
    }
}

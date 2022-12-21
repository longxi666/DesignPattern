package com.dragon.constructon.combination;

public class Test {
    public static void main(String[] args) {

        MenuComponent menu1 = new Menu("菜单管理",2);
        menu1.add(new MenuItem("页面访问",3));

        MenuComponent menu2 = new Menu("权限管理",2);
        menu2.add(new MenuItem("页面访问",3));

        MenuComponent menu3 = new Menu("角色管理",2);
        menu3.add(new MenuItem("页面访问",3));
        menu3.add(new MenuItem("新增角色",3));
        menu3.add(new MenuItem("删除角色",3));

        MenuComponent menu = new Menu("系统管理",1);
        menu.add(menu1);
        menu.add(menu2);
        menu.add(menu3);

        menu.print();
    }
}

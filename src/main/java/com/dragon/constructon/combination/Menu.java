package com.dragon.constructon.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO 树枝节点点 -- 菜单类
 */
public class Menu extends MenuComponent{

    //定义菜单类的子节点
    private List<MenuComponent> child = new ArrayList<>();

    //构造方法
    public Menu(String name,int level){
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent component) {
        child.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        child.remove(component);
    }

    @Override
    public MenuComponent getChild(int index) {
        return child.get(index);
    }

    @Override
    public void print() {
        //打印自身
        for (int i = 0; i < level; i++) {
            System.out.print("- ");
        }
        System.out.println(name);
        //打印子类
        for (MenuComponent component : child) {
            component.print();
        }
    }
}

package com.dragon.constructon.combination;

/**
 * TODO 抽象根节点 -- 菜单组件
 */
public abstract class MenuComponent {

    protected String name;
    protected int level;

    //新增子类
    public void add(MenuComponent component){
        throw new UnsupportedOperationException();
    }

    //移除子类
    public void remove(MenuComponent component){
        throw new UnsupportedOperationException();
    }

    //输出指定子类
    public MenuComponent getChild(int index){
        throw new UnsupportedOperationException();
    }

    //输出菜单组件名
    public String getName() {
        return name;
    }

    //打印菜单名及子类
    public abstract void print();

}

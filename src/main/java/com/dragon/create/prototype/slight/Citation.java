package com.dragon.create.prototype.slight;

/**
 * TODO 浅克隆案例
 */
public class Citation implements Cloneable{

    //成员变量
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println(name + "是好学生！");
    }
    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation)super.clone();
    }
}

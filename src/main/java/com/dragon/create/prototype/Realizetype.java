package com.dragon.create.prototype;

/**
 * TODO 原型模式: 调用clone 方法克隆对象
 */
public class Realizetype implements Cloneable{

    public Realizetype() {
        System.out.println("具体的原型对象构造完成！");
    }

    @Override
    public Realizetype clone() throws CloneNotSupportedException{
        System.out.println("具体原型克隆成功！");
        return (Realizetype)super.clone();
    }

}

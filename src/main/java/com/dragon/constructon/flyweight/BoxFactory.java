package com.dragon.constructon.flyweight;

import java.util.HashMap;

/**
 * @date 2022/11/23 10:15
 * TODO 工厂类 -- 单例
 */
public class BoxFactory {

    private HashMap<String, AbstractBox> map;

    private BoxFactory() {
        map = new HashMap<String, AbstractBox>();
        map.put("I",new IBox());
        map.put("L",new LBox());
        map.put("O",new OBox());
    }

    private static BoxFactory boxFactory = new BoxFactory();

    public static BoxFactory gerInstance(){
        return boxFactory;
    }

    //根据名称获取图形对象
    public AbstractBox getShape(String name){
        return map.get(name);
    }
}

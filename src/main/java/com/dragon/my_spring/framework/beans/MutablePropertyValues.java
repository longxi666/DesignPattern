package com.dragon.my_spring.framework.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @date 2022/12/15 16:26
 * TODO 用来存储和管理PropertyValue 对象
 */
public class MutablePropertyValues implements Iterable<PropertyValue>{

    //定义list 集合对象，用来存储PropertyValue
    private final List<PropertyValue> propertyValueList;

    public MutablePropertyValues() {
        this.propertyValueList = new ArrayList<PropertyValue>();
    }

    public MutablePropertyValues(List<PropertyValue> propertyValueList) {
        if (propertyValueList == null){
            this.propertyValueList = new ArrayList<PropertyValue>();
        } else {
            this.propertyValueList = propertyValueList;
        }
    }

    //获取所有对象的方法，以数组返回
    public PropertyValue[] getPropertyValues() {
        //将集合转换为数组并返回
        return propertyValueList.toArray(new PropertyValue[0]);
    }

    //根据名称获取PropertyValue
    public PropertyValue getPropertyValue(String propertyName) {
        //遍历集合对象
        for (PropertyValue propertyValue : propertyValueList) {
            if(propertyValue.getName().equals(propertyName)){
                return propertyValue;
            }
        }
        return null;
    }

    //判断集合是否为空
    public boolean isEmpty(){
        return propertyValueList.isEmpty();
    }

    //添加
    public MutablePropertyValues addPropertyValue(PropertyValue pv){
        //判断集合中是否有重复
        for (int i = 0; i < propertyValueList.size(); i++) {
            //获取每一个对象
            PropertyValue current = propertyValueList.get(i);
            if(current.getName().equals(pv.getName())){
                propertyValueList.set(i , pv);
                return this;
            }
        }
        this.propertyValueList.add(pv);
        return this;
    }

    //判断是否有指定name 属性值的对象
    public boolean contain(String name){
        return getPropertyValue(name) != null;
    }

    //获取迭代器对象
    @Override
    public Iterator<PropertyValue> iterator() {
        return propertyValueList.iterator();
    }

}

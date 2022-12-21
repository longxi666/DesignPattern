package com.dragon.constructon.iterator;

/**
 * @date 2022/12/1 21:58
 * TODO 抽象迭代器角色接口
 */
public interface StudentIterator {

    //判断是否还有元素
    boolean hasNext();

    //获取下一个元素 -- 泛型
    Student next();
}

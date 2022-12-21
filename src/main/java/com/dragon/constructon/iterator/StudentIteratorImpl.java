package com.dragon.constructon.iterator;

import java.util.List;

/**
 * @date 2022/12/1 22:01
 * TODO 具体的迭代器角色类
 */
public class StudentIteratorImpl implements StudentIterator{

    private List<Student> list;
    private int position = 0;//记录遍历位置

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        return list.get(position++);
    }
}

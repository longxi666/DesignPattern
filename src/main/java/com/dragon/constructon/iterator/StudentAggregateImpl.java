package com.dragon.constructon.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2022/12/1 22:04
 * TODO 抽象聚合角色类
 */
public class StudentAggregateImpl implements StudentAggregate{

    private List<Student> list = new ArrayList<>();
    //添加学生
    public void addStudent(Student student){
        list.add(student);
    }

    //删除学生
    public void removeStudent(Student student){
        list.remove(student);
    }

    //获取迭代器对象
    public StudentIterator getStudentIterator(){
        return new StudentIteratorImpl(list);
    }

}

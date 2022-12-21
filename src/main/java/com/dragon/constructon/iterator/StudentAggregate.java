package com.dragon.constructon.iterator;

/**
 * @date 2022/12/1 22:04
 * TODO 抽象聚合角色类
 */
public interface StudentAggregate {
    //添加学生
    void addStudent(Student student);

    //删除学生
    void removeStudent(Student student);

    //获取迭代器对象
    StudentIterator getStudentIterator();

}

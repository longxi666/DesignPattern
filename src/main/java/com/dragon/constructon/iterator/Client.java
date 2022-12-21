package com.dragon.constructon.iterator;

/**
 * @date 2022/12/1 22:09
 */
public class Client {
    public static void main(String[] args) {
        //创建聚合对象
        StudentAggregateImpl aggregate = new StudentAggregateImpl();

        aggregate.addStudent(new Student("Dragon001","001"));
        aggregate.addStudent(new Student("Dragon002","002"));
        aggregate.addStudent(new Student("Dragon003","003"));
        aggregate.addStudent(new Student("Dragon004","004"));
        aggregate.addStudent(new Student("Dragon005","005"));

        StudentIterator iterator = aggregate.getStudentIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

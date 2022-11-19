package com.dragon.create.prototype.deep;

import java.io.Serializable;

/**
 * TODO 深克隆案例 -- 使用对象流(CitationTestPro)
 */
public class Citation implements Cloneable, Serializable {

   /* //成员变量
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/

    //浅克隆不会克隆引用对象
    private Student student ;


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void show(){
        System.out.println(student.getName() + "是好学生！");
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation)super.clone();
    }
}

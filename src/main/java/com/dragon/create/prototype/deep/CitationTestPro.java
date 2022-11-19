package com.dragon.create.prototype.deep;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CitationTestPro {
    public static void main(String[] args) throws CloneNotSupportedException, Exception {

        Citation citation = new Citation();
        Student student = new Student();
        student.setName("Dragon");
        citation.setStudent(student);

        //创建对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e:/Study/a.txt"));
        //写对象
        oos.writeObject(citation);
        //释放资源
        oos.close();

        //创建对象输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e:/Study/a.txt"));
        //读取对象
        Citation clone = (Citation)ois.readObject();
        //释放资源
        Student clone_student = clone.getStudent();
        clone_student.setName("Dragon_clone");

        citation.show();
        clone.show();
    }
}

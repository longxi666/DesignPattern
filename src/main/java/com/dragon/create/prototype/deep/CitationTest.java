package com.dragon.create.prototype.deep;

public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
        Student student = new Student();
        student.setName("Dragon");
        citation.setStudent(student);

        Citation clone = citation.clone();
        clone.getStudent().setName("Dragon_clone");

        citation.show();
        clone.show();
    }
}

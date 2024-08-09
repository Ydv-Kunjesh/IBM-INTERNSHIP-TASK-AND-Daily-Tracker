

package com.telusko.SpringJDBC.SpringJDBC.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
    public Student() {
        System.out.println("Object Created For Student");
    }

    private int rollNo;
    private String name;
    private int marks;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getMarks() {return marks;}
    public void setMarks(int marks) {this.marks = marks;}
    public int getRollNo() {return rollNo;}
    public void setRollNo(int rollNo) {this.rollNo = rollNo;}

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

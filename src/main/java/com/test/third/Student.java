package com.test.third;

public class Student implements Comparable<Student> {
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public boolean equalsTo(Student t) {
        return this.getRollNo() == t.getRollNo();
    }

    public int compareTo(Student stu) {
        if (getName().compareTo(stu.getName()) > 0) {
            return 1;
        }
        if (getName().compareTo(stu.getName()) < 0) {
            return -1;
        } else return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}


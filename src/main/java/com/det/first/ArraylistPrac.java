package com.det.first;
import java.util.*;
public class ArraylistPrac {
    public static void main(String[] args) {
//        Student s1 = new Student("Xoo", 1);
//        Student s2 = new Student("Kite", 2);
//        Student s3 = new Student("Cat", 3);
//        Student s4 = new Student("Anio", 4);
//        Student s5 = new Student("Ele", 5);
//        Student s6 = new Student("Fauna", 6);
//        Student[] students1 = {s1,s2,s3,s4,s5,s6};
//        Arrays.sort(students1);
//        Comparable[] stu = {83,43,59,81};
//        Arrays.sort(stu);
//        System.out.println(Arrays.toString(stu));
       ArrayList<Comparable> students = new ArrayList<>();
        students.add('a');
        students.add('m');
        students.add('z');
        students.add('v');
        students.add('b');
        students.add('p');

        Collections.sort(students);
        System.out.println(students);

//        System.out.println(stu);

//        List<Student> students = new ArrayList<>();
//        students.add(s1);
//        students.add(s2);
//        students.add(s3);
//        students.add(s4);
//        students.add(s5);
//        students.add(s6);

//        Collections.sort(students);
//        System.out.println(students);

//
//        for(Student s : students){
//            System.out.println(s);
//        }
//        System.out.println(s1.equalsTo(s2));


//         Arrays.asList(s1, s2, s3, s4, s5);
//
//        Collections.shuffle(students);
//
//        students.forEach(System.out::println);


    }
}

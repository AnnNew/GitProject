package com.det.first;

import java.util.*;

public class Practice {
    public int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    //    public static void main(String[] args) {
//        StudentDto studentDtoOne = new StudentDto();
//        studentDtoOne.setFirstName("aaa");
//        studentDtoOne.setLastName("bLastName");
//
//        StudentDto studentDtoTwo = new StudentDto();
//        studentDtoTwo.setFirstName("bb");
//        studentDtoTwo.setLastName("aLastName");
//
//        List<StudentDto> studentDtos = Arrays.asList(studentDtoOne, studentDtoTwo);
//
//        Collections.sort(studentDtos, new Comparator<StudentDto>() {
//            @Override
//            public int compare(StudentDto o1, StudentDto o2) {
//                return o1.getLastName().compareTo(o2.getLastName());
//            }
//        });
//
//        System.out.println(studentDtos);
    public static void main(String[] args) {

        StudentDto studentDto = new StudentDto();
        studentDto.setAge(34);
        StudentDto studentDto1 = new StudentDto();
        studentDto1.setAge(56);
        StudentDto studentDto2 = new StudentDto();
        studentDto2.setAge(78);

        List<StudentDto> list = Arrays.asList(studentDto, studentDto1, studentDto2);

        Collections.sort(list, new Comparator<StudentDto>(){
            @Override
            public int compare(StudentDto o1, StudentDto o2){
                if(o1.getAge()> o2.getAge()) {
                    return 1;
                }
                return -1;
            }

        });
        System.out.println(list);

//        List<Integer> list = Arrays.asList(56,78,98,23);

    }

}



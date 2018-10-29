package com.xusong.object;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:继承
 * @Data: Created on 2018-10-27 11:45
 */
class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Student extends Person {
    private String school;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}

public class TestPerson {
    public static void main(String args[]) {
        Student student = new Student();
        student.setName("许松");
        student.setAge(24);
        student.setSchool("皖西学院");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getSchool());
    }
}

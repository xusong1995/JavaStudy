package com.xusong.object.TestOverWrite;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:方法重写
 * @Data: Created on 2018-10-27 14:32
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

    public String getInfo() {
        return "Name :" + name +"\n" + "Age :" + age;
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

    public String getInfo() {
        return "Name :" + getName() + "\nAge :" + getAge() + "\nSchool" + getSchool();
    }
}

public class TestOverWrite {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();
        person.setName("张三");
        person.setAge(22);
        student.setName("许松");
        student.setAge(24);
        student.setSchool("皖西学院");
        System.out.println(person.getInfo());
        System.out.println(student.getInfo());
    }
}

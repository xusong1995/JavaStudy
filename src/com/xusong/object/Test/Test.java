package com.xusong.object.Test;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 练习
 * @Data: Created on 2018-10-27 16:35
 */
class Person {
    private String name;
    private String location;

    Person(String name) {
        this.name = name;
        location = "北京";
    }

    Person(String name, String location) {
        this.name = name;
        this.location = location;
    }

//    //重写toString方法
//    public String toString() {
//        return "name :" + name + "location :" + location;
//    }

    public String info() {
        return "name :" + name + " location ：" + location;
    }
}

class Teacher extends Person {
    private String job;

    Teacher(String name,String job) {
        this(name,"北京",job);
    }

    Teacher(String n,String l,String job) {
        super(n,l);
        this.job = job;
    }

    public String info() {
        return super.info() + " job :" + job;
    }
}
class Student extends Person {
    private String school;

    Student(String name,String school) {
        this(name,"北京",school);
    }

    Student(String n,String l,String school) {
        super(n,l);
        this.school = school;
    }

    public String info() {
        return super.info() + " school :" + school;
    }
}

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("A");
        Person p2 = new Person("B","上海");
        Student s1 = new Student("C","皖西学院");
        Student s2 = new Student("C","上海","复旦大学");
        Teacher t1 = new Teacher("张三","教授");
        Teacher t2 = new Teacher("李四","成都","讲师");
        System.out.println(p1.info());
        System.out.println(p2.info());
        System.out.println(s1.info());
        System.out.println(s2.info());
        System.out.println(t1.info());
        System.out.println(t2.info());
    }
}

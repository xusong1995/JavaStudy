package com.xusong.object.TestInterface;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 接口
 * @Data: Created on 2018-10-29 13:38
 */
interface Singer {
    public void sing();
    public void sleep();
}

interface Painter {
    public void paint();
    public void eat();
}

class Student implements Singer {
    private String name;

    Student(String name) {
        this.name = name;
    }

    public void study() {
        System.out.println("正在学习");
    }

    public void sing() {
        System.out.println("学生正在唱歌");
    }

    public void sleep() {
        System.out.println("学生正在睡觉");
    }
}

class Teacher implements Singer,Painter {
    private String name;

    Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void teach() {
        System.out.println("正在教书");
    }

    @Override
    public void sing() {
        System.out.println("教师正在唱歌");
    }

    @Override
    public void sleep() {
        System.out.println("教师正在睡觉");
    }

    @Override
    public void paint() {
        System.out.println("教师正在绘画");
    }

    @Override
    public void eat() {
        System.out.println("教师正在吃饭");
    }
}
public class Test {
    public static void main(String[] args) {
        Singer singer1 = new Student("许松");
        singer1.sing();
        singer1.sleep();
        ((Student) singer1).study();
        Singer singer2 = new Teacher("陈言兵");
        singer2.sing();
        singer2.sleep();
        Painter painter = (Painter) singer2;
        painter.paint();
        painter.eat();
    }
}

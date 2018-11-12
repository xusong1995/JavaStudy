package com.xusong.thread;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:
 * @Data: Created on 2018-11-10 15:48
 */
public class TestJoin {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2("abc");
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {

        } finally {
            for (int i =1; i <=10;i++) {
                System.out.println("I am main Thread");
            }
        }
    }
}

class MyThread2 extends Thread {
        //构造方法
    MyThread2(String s) {
        //调用父类Thread的构造方法
        super(s);
    }

    public void run() {
        for (int i = 1; i <=10; i++) {
            //调用的是Thread类的 getName()方法
            System.out.println("I am " + getName());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

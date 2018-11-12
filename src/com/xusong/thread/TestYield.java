package com.xusong.thread;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: yield方法
 * @Data: Created on 2018-11-11 14:29
 */
public class TestYield {
    public static void main(String[] args) {
        MyThread3 t1 =new  MyThread3("线程a");
        MyThread3 t2 = new MyThread3("线程b");
        t1.start();
        t2.start();
    }
}

class MyThread3 extends Thread {
    MyThread3 (String s) {
        super(s);
    }
    public void run() {
        for (int i = 1; i <=100; i++) {
            System.out.println(getName() + ": " + i);
            if (i%10==0) {
                yield();
            }
        }
    }
}

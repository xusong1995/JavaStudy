package com.xusong.thread;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 创建线程的方法二：继承Thread类
 * @Data: Created on 2018-11-10 14:29
 */
public class TestThread_2 {
    public static void main(String[] args) {
        Runner2 r = new Runner2();
        r.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("Main Thread:--------------" + i);
        }
    }
}

//从Thread类继承，表示Runner2是一个新的线程
class Runner2 extends Thread {
    //输出从 0~99
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Runner1 :" + i);
        }
    }
}

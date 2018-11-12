package com.xusong.thread;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 创建线程的方法一：继承Runnable接口
 * @Data: Created on 2018-11-10 14:06
 */
public class TestThread_1 {
    public static void main(String[] args) {
        Runner1 r = new Runner1();
        Thread t = new Thread(r);
        //线程启动
        t.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("Main Thread:--------------" + i);
        }
    }
}

//实现Runnable接口，表示 Runner1类是一个新的线程
class Runner1 implements Runnable {
    //输出从 0~99
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Runner1 :" + i);
        }
    }
}

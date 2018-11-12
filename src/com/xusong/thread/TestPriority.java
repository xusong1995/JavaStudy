package com.xusong.thread;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 线程优先级
 * @Data: Created on 2018-11-11 14:45
 */
public class TestPriority {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());
        thread1.setPriority(Thread.NORM_PRIORITY + 5);
        thread1.start();
        thread2.start();
    }
}

class Thread1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println("Thread1: " + i);
        }
    }
}

class Thread2 implements Runnable {
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println("Thread2: " + i);
        }
    }
}

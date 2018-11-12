package com.xusong.thread;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 死锁
 * @Data: Created on 2018-11-12 17:13
 */
public class TestDeadLock implements Runnable {
    public int flag;
    static Object object1 = new Object();
    static Object object2 = new Object();

    public void run() {
        System.out.println("flag=" + flag);
        if (flag == 1) {
            synchronized (object1) {
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (object2) {
                    System.out.println("1");
                }
            }
        }
        if (flag == 0) {
            synchronized (object2) {
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (object1) {
                    System.out.println("0");
                }
            }
        }
    }

    public static void main(String[] args) {
        TestDeadLock testDeadLock1 = new TestDeadLock();
        TestDeadLock testDeadLock2 = new TestDeadLock();
        testDeadLock1.flag = 1;
        testDeadLock2.flag = 0;
        Thread thread1 = new Thread(testDeadLock1);
        Thread thread2 = new Thread(testDeadLock2);
        thread1.start();
        thread2.start();
    }
}

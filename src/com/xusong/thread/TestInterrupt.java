package com.xusong.thread;

import java.util.Date;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:
 * @Data: Created on 2018-11-10 15:28
 */
public class TestInterrupt {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e) {

        }finally {
            t.interrupt();
        }
    }
}

class MyThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("=====" + new Date() + "=====");
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

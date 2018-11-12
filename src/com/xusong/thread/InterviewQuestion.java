package com.xusong.thread;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 线程同步2
 * @Data: Created on 2018-11-12 18:11
 */
public class InterviewQuestion implements Runnable {
    int b = 100;

    public synchronized void m1() throws Exception{
        b = 1000;
        Thread.sleep(5000);
        System.out.println("b = " + b);
    }

    public void m2() {
        System.out.println(b);
    }

    public void run() {
        try {
            m1();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        InterviewQuestion iq = new InterviewQuestion();
        Thread thread = new Thread(iq);
        thread.start();

        Thread.sleep(1000);
        iq.m2();
    }
}

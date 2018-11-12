package com.xusong.thread;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 线程同步
 * @Data: Created on 2018-11-12 14:26
 */
public class TestSync implements Runnable {
    Timer timer = new Timer();

    public static void main(String[] args) {
        TestSync test = new TestSync();
        //创建一个新的线程
        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);
        //设置线程名称
        t1.setName("t1");
        t2.setName("t2");
        //线程开始执行，调用run方法
        t1.start();
        t2.start();
    }

    public void run() {
        timer.add(Thread.currentThread().getName());
    }
}

class Timer {
    private static int num = 0;

    //在执行该方法时就锁定当前执行该方法的线程对象
    public synchronized void add(String name) {
        //锁定当前线程对象
//        synchronized (this) {
            num++;
            try {
                //睡眠1ms只是为了放大效果，即使不sleep，cpu也可能打断当前线程执行
                Thread.sleep(1);
            } catch (InterruptedException e) {

            } finally {
                System.out.println(name + ",你是第" + num + "个使用timer的线程");
            }
//        }
    }
}

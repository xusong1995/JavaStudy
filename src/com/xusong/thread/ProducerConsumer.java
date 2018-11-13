package com.xusong.thread;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 生产者消费者问题
 * @Data: Created on 2018-11-13 14:22
 */
public class ProducerConsumer {
    //此处模拟的是一个生产者和一个消费者
    public static void main(String[] args) {
        //造一个框
        SyncStack ss = new SyncStack();
        //造一个生产者
        Producer p = new Producer(ss);
        //造一个消费者
        Consumer c = new Consumer(ss);
        //启动线程
        new Thread(p).start();
        new Thread(c).start();
    }
}

//馒头类
class ManTou {
    private int id;

    ManTou(int id) {
        this.id = id;
    }

    //重写toString方法，看见扔的、拿的是哪个馒头
    @Override
    public String toString() {
        return "馒头{" +
                "id=" + id +
                '}';
    }
}

//装馒头的框
class SyncStack {
    //装到第几个
    int index = 1;
    //用数组模拟装馒头的框
    ManTou[] arrManTou = new ManTou[6];

    //往框中扔馒头
    public synchronized void push(ManTou mt) {
        //如果满了，指明该如何处理
        while (index == arrManTou.length) {
            try {
                //当前线程停止
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //唤醒线程
        this.notify();
        arrManTou[index] = mt;
        index++;
    }

    //往外面拿馒头
    public synchronized ManTou pop() {
        //指明框中馒头为空该如何处理
        while (index == 0) {
            try {
                //线程等待
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //唤醒线程
        this.notify();
        index--;
        return arrManTou[index];
    }
}

//生产者类，有多个生产者
class Producer implements Runnable {
    //生产者有框的引用
    SyncStack ss = null;

    //指明往哪个框里扔
    Producer(SyncStack ss) {
        this.ss = ss;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            ManTou mt = new ManTou(i);
            ss.push(mt);
            System.out.println("生产了： " + mt);
            try {
                Thread.sleep((long) (Math.random() * 200));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//消费者类
class Consumer implements Runnable {
    SyncStack ss = null;

    //指明去哪个框中去消费
    Consumer(SyncStack ss) {
        this.ss = ss;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            ManTou mt = ss.pop();
            System.out.println("消费了： " + mt);
            try {
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

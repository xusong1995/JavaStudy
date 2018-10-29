package com.xusong.object.TestInterface;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 接口
 * @Data: Created on 2018-10-29 15:03
 */
public interface Valuable {
    public double getMoney();
}

interface Protectable {
    public void beProtected();
}

interface A extends Protectable {
    void m();
}

abstract class Animal {
    private String name;

    abstract void enjoy();
}

class GoldenMonkey extends Animal implements Valuable,Protectable {
    public double getMoney() {
        return 10000;
    }

    @Override
    public void beProtected() {
        System.out.println("我在房间里睡觉");
    }

    @Override
    void enjoy() {
    }

    public void test() {
        Valuable valuable = new GoldenMonkey();
        valuable.getMoney();
        Protectable protectable = (Protectable) valuable;
        protectable.beProtected();
    }
}

class Hen implements A {
    @Override
    public void beProtected() {

    }

    @Override
    public void m() {

    }
}

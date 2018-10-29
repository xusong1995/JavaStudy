package com.xusong.object.TestPolymoph;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 动态绑定
 * @Data: Created on 2018-10-29 10:37
 */
abstract class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    public abstract void enjoy();

//    public void enjoy() {
//        System.out.println("叫声。。。。。。");
//    }

}


class Cat extends Animal {
    private String eyesColor;

    Cat(String name,String eyesColor) {
        super(name);
        this.eyesColor = eyesColor;
    }

    //重写父类叫声方法
    public void enjoy() {
        System.out.println("猫叫声。。。。。。");
    }
}

class Dog extends Animal {
    private String furColor;

    Dog(String name,String furColor) {
        super(name);
        this.furColor = furColor;
    }

    public void enjoy() {
        System.out.println("狗叫声。。。。。。");
    }
}

class Lady {
    private String name;
    private Animal pet;

    Lady(String name,Animal pet) {
        this.name = name;
        this.pet = pet;
    }

    public void myPetEnjoy() {
        pet.enjoy();
    }
}

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("汤姆猫","屎黄色");
        Dog dog = new Dog("哈巴狗","原谅绿");
        Lady lady1 = new Lady("董小姐",cat);
        Lady lady2 = new Lady("喵小姐",dog);
        lady1.myPetEnjoy();
        lady2.myPetEnjoy();
    }
}

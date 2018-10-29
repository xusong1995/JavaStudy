package com.xusong.object.TestCasting;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 对象转型实例1
 * @Data: Created on 2018-10-28 19:59
 */
class Animal {
    public String name;

    Animal(String name) {
        this.name = name;
    }
}

class Cat extends Animal {
    public String eyesColor;

    Cat(String name,String eyesColor) {
        super(name);
        this.eyesColor = eyesColor;
    }
}

class Dog extends Animal {
    public String furColor;

    Dog(String name,String furColor) {
        super(name);
        this.furColor = furColor;
    }
}

public class TeatCasting {
    public static void main(String[] args) {
        Animal animal = new Animal("name");
        Cat cat = new Cat("catname","blue");
        Dog dog = new Dog("dogname","Black");

        System.out.println(animal instanceof Animal);
        System.out.println(cat instanceof Cat);
        System.out.println(dog instanceof Dog);
        System.out.println(animal instanceof Cat);

        animal = new Dog("bigyellow","yellow");
        System.out.println(animal.name);
        System.out.println(((Dog) animal).furColor);
        System.out.println(animal instanceof Animal);
        System.out.println(animal instanceof Dog);
        Dog dog1 = (Dog) animal;
        System.out.println(dog1.furColor);
    }
}

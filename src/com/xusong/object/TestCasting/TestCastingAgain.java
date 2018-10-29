package com.xusong.object.TestCasting;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 对象转型实例2
 * @Data: Created on 2018-10-28 23:10
 */
public class TestCastingAgain {
    public static void main(String[] args) {
        TestCastingAgain testCastingAgain = new TestCastingAgain();
        Animal animal = new Animal("name");
        Cat cat = new Cat("catname","blue");
        Dog dog = new Dog("dogname","black");
        testCastingAgain.function(animal);
        testCastingAgain.function(cat);
        testCastingAgain.function(dog);
    }

    public void function(Animal animal) {
        System.out.println("name: " + animal.name);
        if(animal instanceof Cat) {
            Cat cat = (Cat) animal;
            System.out.println(" " + cat.eyesColor + " eyes");
        }else if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            System.out.println(" " + dog.furColor + " fur");
        }
    }
}

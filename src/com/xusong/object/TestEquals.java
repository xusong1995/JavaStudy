package com.xusong.object;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 重写Object类中的equals方法
 * @Data: Created on 2018-10-28 18:29
 */
public class TestEquals {
    public static void main(String[] args) {
        Cat cat1 = new Cat("白色","公","20cm","3kg");
        Cat cat2 = new Cat("白色","公","20cm","3kg");
        System.out.println(cat1.equals(cat2));
    }
}

class Cat {
    String color;
    String sex;
    String height;
    String weight;

    Cat(String color, String sex, String height, String weight) {
        this.color = color;
        this.height = height;
        this.sex = sex;
        this.weight = weight;
    }

    public boolean equals(Object object) {
        if(object == null) {
            return false;
        }
        else {
            if(object instanceof Cat){
                Cat cat = (Cat) object;
                if (cat.color == this.color && cat.weight == this.weight && cat.sex == this.sex && cat.height == this.height ) {
                    return  true;
                }
            }
            return false;
        }
    }
}



package com.xusong.commonclass;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 枚举类型举例
 * @Data: Created on 2018-11-06 10:51
 */
public class TestEnum_1 {
    public enum MyColor {red, green, blue};

    public static void main(String[] args) {
        MyColor m = MyColor.red;
        switch (m) {
            case red:
                System.out.println("red");
                break;
            case blue:
                System.out.println("blue");
                break;
            default:
                System.out.println("default");
        }
        System.out.println(m);
    }

}

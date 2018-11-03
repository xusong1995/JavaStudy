package com.xusong.commonclass;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:
 * @Data: Created on 2018-11-02 18:16
 */
public class TestDemo_1 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "hello";
        System.out.println(s1 == s3);    //true

        s1 = new String("hello");
        s2 = new String("hello");
        System.out.println(s1 == s2);    //false
        System.out.println(s1.equals(s2));   //true

        char c[] = {'s','u','n',' ','j','a','v','a'};
        String s4 = new String(c);
        String s5 = new String(c,4,4);
        System.out.println(s4);
        System.out.println(s5);
    }
}

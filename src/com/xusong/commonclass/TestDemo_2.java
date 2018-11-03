package com.xusong.commonclass;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:
 * @Data: Created on 2018-11-02 19:00
 */
public class TestDemo_2 {
    public static void main(String[] args) {
        String s1 = "sun java";
        String s2 = "Sun Java";
        //返回char指定索引处的值。
        System.out.println(s1.charAt(1));
        //返回此字符串的长度。
        System.out.println(s2.length());
        System.out.println(s1.indexOf("java"));
        System.out.println(s1.indexOf("Java"));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        String s = "我是程序员，我在学java";
        String sr = s.replace('我','你');
        System.out.println(sr);
    }
}

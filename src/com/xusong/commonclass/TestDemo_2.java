package com.xusong.commonclass;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: String类练习2
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
        //返回指定字符第一次出现的字符串内的索引。
        System.out.println(s1.indexOf("java"));
        //不在此字符串内返回-1
        System.out.println(s1.indexOf("Java"));
        //将此字符串与指定对象进行比较。 其结果是true当且仅当该参数不是null并且是String对象，表示相同的字符序列作为该对象。
        System.out.println(s1.equals(s2));
        //将此String与其他String比较。 如果两个字符串的长度相同，并且两个字符串中的相应字符相等,忽略大小写，认为两个字符串是相等的。
        System.out.println(s1.equalsIgnoreCase(s2));

        String s = "我是程序员，我在学java";
        String sr = s.replace('我','你');
        System.out.println(sr);
    }
}

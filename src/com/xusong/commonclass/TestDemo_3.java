package com.xusong.commonclass;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: String类练习3
 * @Data: Created on 2018-11-03 12:36
 */
public class TestDemo_3 {
    public static void main(String[] args) {
        String s1 = "Welcome to java world!";
        String s2 = "   sun java    ";
        System.out.println(s1.startsWith("Welcome"));  //true
        System.out.println(s1.endsWith("World"));      //false
        String sL = s1.toLowerCase();                  //改成小写
        String sU = s1.toUpperCase();                  //改成大写
        System.out.println(sL);                        //welcome to java world!
        System.out.println(sU);                        //WELCOME TO JAVA WORLD!
        //返回一个字符串，该字符串是此字符串的子字符串。 子字符串以指定索引处的字符开头，并扩展到该字符串的末尾。subString是子字符串的意思。
        String subs = s1.substring(11);
        System.out.println(subs);                      //java world!
        //返回一个字符串，其值为此字符串，并删除任何前导和尾随空格，中间的空格不会被去掉。trim是修剪的意思。
        String sp = s2.trim();
        System.out.println(s2);
        System.out.println(sp);
    }
}

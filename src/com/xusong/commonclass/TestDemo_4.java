package com.xusong.commonclass;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: String类练习4
 * @Data: Created on 2018-11-03 14:34
 */
public class TestDemo_4 {
    public static void main(String[] args) {
        /**
         * public static String valueOf(int i)
         * 返回int参数的字符串形式。
         * 该表示恰好是一个参数的Integer.toString方法返回的表示。
         */
        int j = 1234567;
        String sNumber = String.valueOf(j);
        System.out.println("j 是" + sNumber.length() + "位数。");

        /**
         * 方法public String[] split(String regex)
         * 可以将一个字符串按照指定的分隔符分隔，返回分隔后的字符串数组。
         */
        String s = "Mary,F,1976";
        String split[] = s.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

        String test1 = "ddboo, and, fookk";
        String test[] = test1.split("o");
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
    }
}

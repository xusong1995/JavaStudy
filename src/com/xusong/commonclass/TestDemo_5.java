package com.xusong.commonclass;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 输出一个字符串中的大写英文字母数，小写英文字母数以及非英文字母数。
 * @Data: Created on 2018-11-03 15:03
 */
public class TestDemo_5 {
    public static void main(String[] args) {
        String s1 = "AAAAAAAAAAAABBBBBBBBBaaaaaaaaabbbbbbbbb测试测试测%$#&*试";
        int lCount = 0;         //小写字母计数
        int uCount = 0;         //大写字母计数
        int oCount = 0;         //非英文字母计数
        for (int i = 0; i < s1.length(); i++) {
            char s2 = s1.charAt(i);
            if (s2 >= 'a' && s2 <= 'z') {
                lCount++;
            }else if (s2 >= 'A' && s2 <= 'Z') {
                uCount++;
            }else {
                oCount++;
            }
        }
        System.out.println("小写字母数为" + lCount);
        System.out.println("大写字母数为" + uCount);
        System.out.println("非英文字母数为" + oCount);
    }

}

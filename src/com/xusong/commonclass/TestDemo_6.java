package com.xusong.commonclass;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 输出一个字符串中，指定字符串出现的次数
 * @Data: Created on 2018-11-05 13:51
 */
public class TestDemo_6 {
    public static void main(String[] args) {
        String s1 = "Hello World 你好 世界 你好 hello 世界 World 你好";
        String s2 = "你好";
        int count = 0;
        int index = -1;
        /**
         * public String substring(int beginIndex)
         * 返回一个字符串，该字符串是此字符串的子字符串。
         * 子字符串以指定索引处的字符开头，并扩展到该字符串的末尾。
         */
        s1 = s1.substring(index + s2.length());

        while ((index = s1.indexOf(s2)) != -1) {
            s1 = s1.substring(index + s2.length());
            count ++;
        }
        System.out.println(count);
    }
}

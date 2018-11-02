package com.xusong.array;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 二维数组例二
 * @Data: Created on 2018-11-02 13:16
 */
public class TestDyadicArray_2 {
    public static void main(String[] args) {
        String s[][];
        s = new String[3][];
        s[0] = new String[2];
        s[1] = new String[3];
        s[2] = new String[2];

        //给数组元素赋值
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                s[i][j] = new String("我的位置是：" + i + "," + j);
            }
        }

        //打印数组元素的值
        for (int i = 0; i < s.length; i++) {
            for (int j =0; j < s[i].length; j++) {
                System.out.println(s[i][j] + " ");
            }
            System.out.println();
        }
    }
}

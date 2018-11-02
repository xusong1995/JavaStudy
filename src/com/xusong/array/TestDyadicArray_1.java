package com.xusong.array;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 二维数组例一
 * @Data: Created on 2018-11-02 12:22
 */
public class TestDyadicArray_1 {
    public static void main(String[] args) {
        int a[][] = { {1,2}, {3,3,5}, {7,4,8} };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("a[" + i + "][" + j + "] = " + a[i][j] + " ");
            }
        }
    }
}

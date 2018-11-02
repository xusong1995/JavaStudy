package com.xusong.array;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 二分法查找
 * @Data: Created on 2018-11-02 11:29
 */
public class TestSearch {
    public static void main(String[] args) {
        int a[] = {1, 3, 6, 8, 9, 10, 12, 18, 20, 34};
        int i = 12;
        System.out.println(binarySearch(a, i));
    }

    public static int search(int a[], int num) {
        for (int i =0; i < a.length; i++) {
            if (a[i] == num)
                return i;
        }
        return -1;
    }

    public static int binarySearch(int a[], int num) {
        if (a.length == 0) {      //如果数组为空，返回-1，代表没找到
            return -1;
        }
        int startPos = 0;         //起始位置
        int endPos = a.length-1;  //结束位置
        int m = (startPos + endPos) / 2;     //中间位置
        while (startPos <= endPos) {
            if (num == a[m]) {      //正好在中间位置
                return m;
            }
            if (num > a[m]) {
                startPos = m + 1;
            }
            if (num < a[m]) {
                endPos = m - 1;
            }
            m = (startPos + endPos) / 2;
        }
        return -1;
    }

}

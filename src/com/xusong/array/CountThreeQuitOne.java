package com.xusong.array;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 500个人手拉手围成一个圈，从第一个人依次开始数数，数到3的那个人，就退出
 * @Data: Created on 2018-10-31 15:55
 */
public class CountThreeQuitOne  {
    public static void main(String[] args) {
        //用一个boolean类型的数组来模拟500个人
        boolean arr[] = new boolean[500];

        //true代表在圈里，false代表不在圈里
        for (int i =0; i < arr.length; i++) {
            arr[i] = true;
        }

        //leftCount记录圈里还剩下的人
        int leftCount = arr.length;
        //countNum是计数器，初始值为0
        int countNum = 0;
        int index = 0;

        while (leftCount > 1) {
            if(arr[index] == true) {
                countNum ++;
                if (countNum == 3) {
                    countNum = 0;
                    arr[index] = false;
                    leftCount --;
                }
            }
            index ++;
            //一圈数完index回0
            if (index == arr.length) {
                index = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == true) {
                System.out .println(i);
            }
        }
    }
}

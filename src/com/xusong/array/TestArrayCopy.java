package com.xusong.array;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 数组的复制
 * @Data: Created on 2018-11-02 15:33
 */
public class TestArrayCopy {
    public static void main(String[] args) {
        String s[] = {"微软", "IBM", "Sun", "Oracle", "Apple"};
        String sBak[] = new String[6];
        System.arraycopy(s,0,sBak,0,s.length);

        for (int i = 0; i < sBak.length; i++) {
            System.out.print(sBak[i] + " ");
        }

        System.out.println();
        System.out.println();
        int intArray[][] = {{1,2},{1,2,3},{3,4}};
        int intArrayBack[][] = new int[3][];
        System.arraycopy(intArray,0,intArrayBack,0,intArray.length);
        intArrayBack[2][1] = 100;

        for (int i =0; i < intArrayBack.length; i++) {
            for (int j = 0; j < intArrayBack[i].length; j++) {
                System.out.print(intArrayBack[i][j] + " ");
            }
            System.out.println();
        }

        for (int i =0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.print(intArray[i][j] + " ");
            }
            System.out.println();
        }
     }
}

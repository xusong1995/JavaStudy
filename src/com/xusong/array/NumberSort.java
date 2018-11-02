package com.xusong.array;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:
 * @Data: Created on 2018-10-30 16:29
 */
public class NumberSort {
    public static void main(String[] args) {
        int a[] = new int[args.length];

        for (int i =0; i < args.length; i++) {
            a[i] = Integer.parseInt(args[i]);
        }
        print(a);
        selectionSort(a);
        print(a);
    }

    private static void print(int a[]) {
        for (int i =0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    //优化排序算法,折中排序法
    private static void selectionSort(int a[]) {
        int k;
        int temp;
        for (int i = 0; i < a.length; i++) {
            k = i;
            for (int j = k + 1; j < a.length; j++) {
                if (a[j] < a[k]) {
                    k = j;
                }
            }
            if (k != i) {
                temp = a[i];
                a[i] = a[k];
                a[k] = temp;
            }
        }
        System.out.println();
    }


/*
    //选择排序
    private static void selectionSort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int temp;
                    temp= a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println();
     }*/
}

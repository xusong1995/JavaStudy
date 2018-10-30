package com.xusong.array;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:
 * @Data: Created on 2018-10-30 19:17
 */
public class TestDateSort {
    public static void main(String[] args) {
        Date date[] = new Date[5];
        date[0] = new Date(2018,9,13);
        date[1] = new Date(2018,9,14);
        date[2] = new Date(2018,9,15);
        date[3] = new Date(2018,9,16);
        date[4] = new Date(2018,9,17);

        bubbleSort(date);

        for (int i = 0; i < date.length; i++) {
            System.out.println(date[i]);
        }
    }

    //冒泡排序
    public static Date[] bubbleSort(Date[] dates) {
        int length = dates.length;
        for (int i = length -1; i >= 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (dates[j].compare(dates[j+1])) {
                    Date temp = dates[j];
                    dates[j] = dates[j+1];
                    dates[j+1] = temp;
                }
            }
        }
        return dates;
    }
}


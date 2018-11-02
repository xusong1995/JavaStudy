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
        date[0] = new Date(2018,9,10);
        date[1] = new Date(2018,9,14);
        date[2] = new Date(2018,9,11);
        date[3] = new Date(2018,9,16);
        date[4] = new Date(2018,9,17);

        bubbleSort(date);

        for (int i = 0; i < date.length; i++) {
            System.out.println(date[i]);
        }

        Date m = new Date(2018,9,11);
        System.out.println(binarySearch(date, m));
    }

    //冒泡排序
    public static Date[] bubbleSort(Date[] dates) {
        int length = dates.length;
        for (int i = length - 1; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (dates[j].compare(dates[j+1]) > 0) {
                    Date temp = dates[j];
                    dates[j] = dates[j+1];
                    dates[j+1] = temp;
                }
            }
        }
        return dates;
    }

    public static int binarySearch(Date date[],Date m) {
        int startPos = 0;
        int endPos = date.length - 1;
        int mid = (startPos + endPos) / 2;
        while (startPos <= endPos) {
            if (m.compare(date[mid]) == 0) {
                return mid;
            }
            if (m.compare(date[mid]) == 1) {
                startPos = mid + 1;
            }
            if (m.compare(date[mid]) == -1) {
                endPos = mid - 1;
            }
            mid = (startPos + endPos) / 2;
        }
        return -1;
    }
}



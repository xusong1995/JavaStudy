package com.xusong.array;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 一维数组内存分析
 * @Data: Created on 2018-10-30 13:15
 */
public class TestArray {
    public static void main(String[] args) {
        Date[] days;
        days = new Date[3];
        for (int i = 0; i < 3; i++) {
            days[i] = new Date(2018,4,i+1);
        }
    }
}

class Date {
    int year;
    int month;
    int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}

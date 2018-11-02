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

    public int compare(Date date) {
        return year > date.year ? 1
                :year < date.year ? -1
                :month > date.month ? 1
                :month < date.month ? -1
                :day > date.day ? 1
                :day < date.day ? -1 : 0;
    }

    public String toString () {
        return "Year:Month:Day -- " + year + "-" + month + "-" + day;
    }
}

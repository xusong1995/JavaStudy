package com.xusong.commonclass;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 编写一个方法，返回一个double类型的二维数组，数组中的元素通过解析字符串参数获得。
 *               如字符串参数为： "1,2;3,4,5;6,7,8"
 *               对应的数组为：
 *               d[0,0] = 1.0  d[0,1] = 2.0
 *               d[1,0] = 3.0  d[1,1] = 4.0  d[1,2] = 5.0
 *               d[2,0] = 6.0  d[2,1] = 7.0  d[2,2] = 8.0
 * @Data: Created on 2018-11-05 21:55
 */
public class TestDemo_9 {
    public static void main(String[] args) {
        String s1 = "1,2;3,4,5;6,7,8";

        //将一个字符串分割为子字符串，然后将结果作为字符串数组返回。
        //所以字符串数组first里有三个字符串，分别为：“1，2”  “3，4，5”  “6，7，8”
        String first[] = s1.split(";");

        double[][] date;

        //分配二维数组第一维的长度
        date = new double[first.length][];

        for (int i = 0; i < first.length; i++) {
            String second[] = first[i].split(",");

            //分配二维数组第二维的长度
            date[i] = new double[second.length];

            for (int j = 0; j < second.length; j++) {
                //将字符串转换成double类型
                date[i][j] = Double.parseDouble(second[j]);
            }
        }
        for (int i=0; i<date.length;i++) {
            for (int j = 0; j<date[i].length; j++) {
                System.out.print(date[i][j] + " ");
            }
            System.out.println();
        }
    }
}

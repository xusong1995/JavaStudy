package com.xusong.commonclass;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: Math类举例
 * @Data: Created on 2018-11-06 08:44
 */
public class TestMath_1 {
    public static void main(String[] args) {
        //返回 0.0到 1.0的随机数
        double a = Math.random();
        System.out.println(a);
        double b = Math.random();
        System.out.println(b);
        //平方根
        System.out.println(Math.sqrt(a * a + b * b));
        //pow(doble a,double b)    a的b次幂
        System.out.println(Math.pow(a, 8));
        //long round(double a)   double型的数据转成long型
        System.out.println(Math.round(b));
        //log  自然对数
        //pow(doble a,double b)    a的b次幂
        System.out.println(Math.log(Math.pow(Math.E, 15)));
        double d = 60.0;
        double r = Math.PI / 4;
        //角度转弧度
        System.out.println(Math.toRadians(d));
        //弧度转角度
        System.out.println(Math.toDegrees(r));
    }
}

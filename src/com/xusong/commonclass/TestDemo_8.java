package com.xusong.commonclass;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 包装类举例
 * @Data: Created on 2018-11-05 17:39
 */
public class TestDemo_8 {
    public static void main(String[] args) {
        //将100这个数值构造成一个新分配的 Integer对象
        Integer i = new Integer(100);
        //构造一个新分配的 Double对象，表示原始 double参数,此处为 123.456。
        Double d = new Double("123.456");
        /**
         * public int intValue()
         * 将 Integer的值转换成 int类型 。
         */
        int j = i.intValue() + d.intValue();
        /**
         * public float floatValue()
         * 将 Integer的值转换成 float类型 。
         */
        float f = i.floatValue() + d.floatValue();
        System.out.println(j);
        System.out.println(f);
        /**
         * public static double parseDouble(String s)
         * 将String类型数据转换成double类型
         */
        double pi = Double.parseDouble("3.1415926");
        /**
         * public static Double valueOf(double d)
         * 返回一个Double double值的Double实例。
         * public double doubleValue()
         * 返回此 Double对象的 double值。
         */
        double r = Double.valueOf("2.0").doubleValue();
        double s = pi * r * r;
        System.out.println(s);
        try {
            /**
             * public static int parseInt(String s)
             *                     throws NumberFormatException
             * 将字符串参数解析为带符号的十进制整数。
             * 字符串中的字符都必须是十进制数字，除了第一个字符可能是ASCII减号'-' （ '\u002D' ）以指示负值或ASCII加号'+' （ '\u002B' ）以指示正值。
             * 异常：NumberFormatException ：如果字符串不包含可解析整数。
             */
            int k = Integer.parseInt("125");
            System.out.println(k);
        } catch (NumberFormatException e) {
            System.out.println("数据格式不对！");
        }
        //以二进制形式表示出来
        System.out.println(Integer.toBinaryString(123) + "B");
        //以十六进制形式表示出来
        System.out.println(Integer.toHexString(123) + "H");
        //以八进制形式表示出来
        System.out.println(Integer.toOctalString(123) + "O");
    }
}

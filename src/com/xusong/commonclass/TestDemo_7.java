package com.xusong.commonclass;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: StringBuffer类的用法
 * @Data: Created on 2018-11-05 15:07
 */
public class TestDemo_7 {
    public static void main(String[] args) {
        String s = "Microsoft";
        char a[] = {'a', 'b', 'c'};
        //将s转变成一个可变的字符序列
        StringBuffer stringBuffer1 = new StringBuffer(s);
        stringBuffer1.append('/').append("IBM").append('/').append("Sun");
        System.out.println(stringBuffer1);
        StringBuffer stringBuffer2 = new StringBuffer("数字");
        for (int i = 0; i <= 9; i++) {
            stringBuffer2.append(i);
        }
        System.out.println(stringBuffer2);
        stringBuffer2.delete(8, stringBuffer2.length()).insert(0, a);
        System.out.println(stringBuffer2);
        //逆序输出
        System.out.println(stringBuffer2.reverse());
    }
}

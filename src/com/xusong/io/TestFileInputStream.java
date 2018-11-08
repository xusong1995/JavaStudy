package com.xusong.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 文件读取操作例子
 * @Data: Created on 2018-11-08 11:30
 */
public class TestFileInputStream {
    public static void main(String[] args) {
        int b = 0;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("f:\\CloudMusic\\TestFileInputStream.txt");
        } catch (FileNotFoundException e) {
            System.out.println("找不到指定文件");
            System.exit(-1);
        }

        try {
            long num = 0;
            while ((b = fileInputStream.read()) != -1) {
                System.out.print((char)b);
                num ++;
            }
            fileInputStream.close();
            System.out.println();
            System.out.println("共读取了 " + num + " 个字节");
        } catch (IOException e) {
            System.out.println("文件读取错误");
            System.exit(-1);
        }
    }
}

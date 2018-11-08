package com.xusong.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:
 * @Data: Created on 2018-11-08 16:35
 */
public class TestBufferStream_1 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("f:/CloudMusic/TestFileInputStream.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int c = 0;
            System.out.println((char) bufferedInputStream.read());
            System.out.println((char) bufferedInputStream.read());
            //直接从第100个字符开始读取数据
            bufferedInputStream.mark(100);
            for (int i = 0; i <= 10 && (c = bufferedInputStream.read()) != -1; i++) {
                System.out.print((char) c + " ");
            }
            System.out.println();
            bufferedInputStream.reset();
            for (int i = 0; i <= 10 && (c = bufferedInputStream.read()) != -1; i++) {
                System.out.print((char) c + " ");
            }
            bufferedInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

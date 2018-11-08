package com.xusong.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:
 * @Data: Created on 2018-11-08 16:01
 */
public class TestFileReader {
    public static void main(String[] args) {
        FileReader fileReader = null;
        int c = 0;
        try {
            fileReader = new FileReader("f:/CloudMusic/TestFileReader.txt");
            int ln = 0;
            while ((c = (fileReader.read())) != -1) {
                System.out.print((char)c);
            }
            fileReader.close();
        }catch (FileNotFoundException e) {
            System.out.println("找不到指定文件");
        }catch (IOException e) {
            System.out.println("文件读取错误");
        }
    }
}

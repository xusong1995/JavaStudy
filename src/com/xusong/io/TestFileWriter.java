package com.xusong.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: FileReader
 * @Data: Created on 2018-11-08 16:16
 */
public class TestFileWriter {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("f:/CloudMusic/TestFileWriter.dat");
            for (int c =0;c<=50000;c++) {
                fileWriter.write(c);
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件写入错误");
            System.exit(-1);
        }
    }
}

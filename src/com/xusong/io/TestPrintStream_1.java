package com.xusong.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:
 * @Data: Created on 2018-11-09 14:24
 */
public class TestPrintStream_1 {
    public static void main(String[] args) {
        PrintStream printStream = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("f:CloudMusic/Test1.txt");
            printStream = new PrintStream(fileOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (printStream !=null) {
            System.setOut(printStream);
        }
        int ln = 0;
        for (char c = 0; c <= 60; c++) {
            System.out.println(c + " ");
            if (ln++ >=100) {
                System.out.println();
                ln = 0;
            }
        }
    }
}

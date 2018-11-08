package com.xusong.io;

import java.io.*;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:
 * @Data: Created on 2018-11-08 17:39
 */
public class TestBufferStream_2 {
    public static void main(String[] args) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("f:/CloudMusic/Test1.txt"));
            BufferedReader bufferedReader = new BufferedReader(new FileReader("f:/CloudMusic/Test2.txt"));
            String s = null;
            //向 Test1中写入100行随机数
            for (int i = 1; i <= 100; i++) {
                s = String.valueOf(Math.random());
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            while ((s = bufferedReader.readLine()) != null) {
                System.out.println(s);
            }
            bufferedWriter.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

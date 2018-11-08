package com.xusong.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 转换流
 * @Data: Created on 2018-11-08 21:44
 */
public class TestTransform_1 {
    public static void main(String[] args) {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("f:/CloudMusic/Test1.txt"));
            outputStreamWriter.write("microsoft");
            System.out.println(outputStreamWriter.getEncoding());
            outputStreamWriter.close();
            outputStreamWriter = new OutputStreamWriter(new FileOutputStream("f:/Cloudmusic/test2", true),"ISO8859_1");
            outputStreamWriter.write("microsoft");
            System.out.println(outputStreamWriter.getEncoding());
            outputStreamWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

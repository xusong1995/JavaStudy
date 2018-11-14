package com.xusong.commonclass;

import java.io.*;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: File类举例
 * @Data: Created on 2018-11-06 09:31
 */
public class TestFile_1 {
    public static void main(String[] args) {
        //File的静态属性String seperator存储了当前系统的路径分隔符(windows为反斜杠。Linux为正斜杠)
        String seperator = File.separator;
        System.out.println(seperator);
        //定义文件名
        String filename = "myfile.txt";
        //定义路径
        String directory = "mydir1" + seperator + "mydir2";
        File f = new File(directory, filename);
        if (f.exists()) {
            System.out.println("文件名： " + f.getAbsolutePath());
            System.out.println("文件大小： " + f.length());
        } else {
            f.getParentFile().mkdirs();
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

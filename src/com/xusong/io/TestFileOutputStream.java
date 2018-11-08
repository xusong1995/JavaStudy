package com.xusong.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 文件复制操作
 * @Data: Created on 2018-11-08 11:48
 */
public class TestFileOutputStream {
    public static void main(String[] args) {
        int b = 0;
        FileInputStream fileInputStream = null;         //"建立管道"，读数据用
        FileOutputStream fileOutputStream = null;       //"建立管道"，写数据用
        try {
            //"插入管道"，用以从 f:/CloudMusic/TestFileInputSstream.txt读取数据
            fileInputStream = new FileInputStream("f:/CloudMusic/TestFileInputStream.txt");
            //"插入管道"，用以写入数据到 f:/CloudMusic/TestFileOutputStream.txt， 没有的话自动建立新文件
            fileOutputStream = new FileOutputStream("f:/CloudMusic/TestFileOutputStream.txt");
            //此处相当于复制操作
            while ((b = (fileInputStream.read())) != -1) {
                fileOutputStream.write(b);
            }
            //"管道"用完后记得要"拔"出来噢
            fileInputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e1) {
            System.out.println("找不到指定文件");
            System.exit(-1);
        } catch (IOException e2) {
            System.out.println("文件复制错误");
            System.exit(-1);
        }
        System.out.println("文件已复制");
    }
}

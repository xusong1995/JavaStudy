package com.xusong.commonclass;

import java.io.*;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 在命令行中以树状结构展现特定的文件夹及其子文件（夹）
 * @Data: Created on 2018-11-06 10:11
 */
public class TestFile_2 {
    public static void main(String[] args) {
        File file = new File("d:/A");
        System.out.println(file.getName());
        tree(file, 1);
    }

    private static void tree(File file, int level) {
        String preStr = "";
        for (int i = 0; i < level; i++) {
            preStr += "    ";
        }
        File childs[] = file.listFiles();
        for (int i = 0; i < childs.length; i++) {
            System.out.println(preStr + childs[i].getName());
            if (childs[i].isDirectory()) {
                tree(childs[i], level + 1);
            }
        }
    }
}

package com.xusong.container;

import java.util.LinkedList;
import java.util.List;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: List程序举例
 * @Data: Created on 2018-11-06 22:51
 */
public class TestDemo_7 {
    public static void main(String[] args) {
        List list = new LinkedList();
        for (int i = 0; i <= 5; i++) {
            list.add("a" + i);
        }
        System.out.println(list);
        //在第 3个位置上添加 a100
        list.add(3, "a100");
        System.out.println(list);
        //将第 6个位置上的数替换为 a200
        list.set(6, "a200");
        System.out.println(list);
        System.out.print((String)list.get(2) + " ");
        System.out.println(list.indexOf("a3"));
        //将第一个位置上元素移除
        list.remove(1);
        System.out.println(list);
    }
}

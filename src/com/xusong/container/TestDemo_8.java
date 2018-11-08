package com.xusong.container;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:
 * @Data: Created on 2018-11-06 23:20
 */
public class TestDemo_8 {
    public static void main(String[] args) {
        List list1 = new LinkedList();
        List list2 = new LinkedList();
        for (int i = 0; i <= 9; i++) {
            list1.add("a" + i);
        }
        System.out.println(list1);
        Collections.shuffle(list1);     //随机排列
        System.out.println(list1);
        Collections.reverse(list1);     //逆序排列
        System.out.println(list1);
        Collections.sort(list1);        //排序
        System.out.println(list1);
        System.out.println(Collections.binarySearch(list1,"a5"));      //折半查找
    }
}

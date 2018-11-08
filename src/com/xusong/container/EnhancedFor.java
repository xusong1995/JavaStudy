package com.xusong.container;


import java.util.ArrayList;
import java.util.Collection;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 增强的for循环
 * @Data: Created on 2018-11-06 18:55
 */
public class EnhancedFor {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
        Collection collection = new ArrayList();
        collection.add(new String("aaa"));
        collection.add(new String("bbb"));
        collection.add(new String("ccc"));
        for (Object object : collection) {
            System.out.println(object);
        }
    }
}

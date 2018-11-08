package com.xusong.container;

import java.util.HashSet;
import java.util.Set;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:
 * @Data: Created on 2018-11-06 22:00
 */
public class TestDemo_5 {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("hello");
        set.add("world");
        set.add(new Name("f1", "f2"));
        set.add(new Integer(100));
        set.add(new Name("f1", "f2"));      //相同元素不会被加入
        set.add("hello");                   //相同元素不会被加入
        System.out.println(set);
    }
}

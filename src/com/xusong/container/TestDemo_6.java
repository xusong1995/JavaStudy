package com.xusong.container;

import java.util.HashSet;
import java.util.Set;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: Set方法举例
 * @Data: Created on 2018-11-06 22:16
 */
public class TestDemo_6 {
    public static void main(String[] args) {
        Set s1 = new HashSet();
        Set s2 = new HashSet();
        s1.add("a");
        s1.add("b");
        s1.add("c");
        s2.add("d");
        s2.add("a");
        s2.add("b");
        //Set和List容器都具有Constructor(Collection c)
        //构造方法用以初始化容器类
        //把 s1对象所有内容都copy到 sn里面
        Set sn = new HashSet(s1);
        //求两个集合的交集
        sn.retainAll(s2);
        //把 s1对象所有内容都copy到 su里面
        Set su = new HashSet(s1);
        ////把 s2对象所有内容都添加到 sn里面，但重复的内容不会被添加
        su.addAll(s2);
        System.out.println(sn);
        System.out.println(su);
    }
}

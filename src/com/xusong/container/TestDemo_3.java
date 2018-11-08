package com.xusong.container;

import java.util.Collection;
import java.util.HashSet;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:
 * @Data: Created on 2018-11-06 16:03
 */
public class TestDemo_3 {
    public static void main(String[] args) {
        Collection c = new HashSet();
        c.add("hello");
        c.add(new Name("f1", "11"));
        c.add(new Integer(100));
        c.remove("hello");
        c.remove(new Integer(100));
        //成功去除返回True，失败返回false
        System.out.println(c.remove(new Name("f1","11")));
        System.out.println(c);
    }
}

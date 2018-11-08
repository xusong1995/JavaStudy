package com.xusong.container;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:
 * @Data: Created on 2018-11-06 15:16
 */
public class TestDemo_2 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        //可以放入不同类型对象
        c.add("hello");
        c.add(new Name("f1","11"));
        c.add(new Integer(100));
        System.out.println(c.size());
        System.out.println(c);
    }
}

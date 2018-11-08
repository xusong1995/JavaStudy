package com.xusong.container;

import java.util.*;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 泛型举例
 * @Data: Created on 2018-11-07 15:41
 */
public class BasicGeneric {
    public static void main(String[] args) {
        List<String> c = new ArrayList<String>();
        c.add("aaa");
        c.add("bbb");
        c.add("ccc");
        for (int i = 0; i < c.size(); i++) {
            String s = c.get(i);
            System.out.println(s);
        }

        Collection<String> collection = new HashSet<String>();
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        for (Iterator<String> iterator = collection.iterator(); iterator.hasNext(); ) {
            String s = iterator.next();
            System.out.println(s);
        }
    }
}

class MyName implements Comparable<MyName> {
    int age;

    @Override
    public int compareTo(MyName myName) {
        if (this.age > myName.age)
            return 1;
        else if (this.age > myName.age)
            return -1;
        else
            return 0;
    }
}


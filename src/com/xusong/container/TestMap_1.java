package com.xusong.container;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: Mao类举例
 * @Data: Created on 2018-11-07 13:38
 */
public class TestMap_1 {
    public static void main(String[] args) {
        Map map1 = new HashMap();
        Map map2 = new TreeMap();
        map1.put("one", new Integer(1));
        map1.put("two", new Integer(2));
        map1.put("three", new Integer(3));
        map2.put("A", new Integer(1));
        map2.put("B", new Integer(2));
        System.out.println(map1.size());
        System.out.println(map1.containsKey("one"));
        System.out.println(map2.containsValue(new Integer(1)));
        if (map1.containsKey("two")) {
            int i = ((Integer)map1.get("two")).intValue();
            System.out.println(i);
        }
        Map map3 = new HashMap(map1);
        map3.putAll(map2);
        System.out.println(map3);
    }
}

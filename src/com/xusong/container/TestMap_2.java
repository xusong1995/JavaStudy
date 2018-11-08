package com.xusong.container;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;
/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:
 * @Data: Created on 2018-11-07 14:02
 */
public class TestMap_2 {
    public static void main(String[] args) {
        Map map1 = new HashMap();
        Map map2 = new TreeMap();
//        map1.put("one", new Integer(1));
        map1.put("one", 1);
        map1.put("two", new Integer(2));
        map1.put("three", new Integer(3));
        map2.put("A", new Integer(1));
        map2.put("B", new Integer(2));
        System.out.println(map1.size());
        System.out.println(map1.containsKey("one"));
        System.out.println(map2.containsValue(1));
        if (map1.containsKey(2)) {
            int i = ((Integer)map1.get("two")).intValue();
            System.out.println(i);
        }
        Map map3 = new HashMap(map1);
        map3.putAll(map2);
        System.out.println(map3);
    }
}

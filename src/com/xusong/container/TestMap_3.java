package com.xusong.container;

import java.util.*;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: Map类举例
 * @Data: Created on 2018-11-07 14:24
 */
public class TestMap_3 {
    private static final Integer ONE = new Integer(1);

    public static void main(String[] args) {
        Map map = new HashMap();
        for (int i = 0; i < args.length; i++) {
            Integer freq = (Integer) map.get(args[i]);
            map.put(args[i], (freq == null ? ONE : new Integer(freq.intValue() + 1)));
        }
        System.out.println(map.size() + " distinct words detected");
        System.out.println(map);
    }
}

package com.xusong.container;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:
 * @Data: Created on 2018-11-06 17:39
 */
public class TestDemo_4 {
    public static void main(String[] args) {
        //定义一个底层用哈希表实现的容器
        Collection collection = new HashSet();
        collection.add(new Name("f1", "11"));
        collection.add(new Name("f2", "12"));
        collection.add(new Name("f3", "13"));
        Iterator iterator = collection.iterator();
        //遍历
        while (iterator.hasNext()) {
            //name的返回值为object类型，需要转换为相应类型
            Name name = (Name) iterator.next();
            System.out.println(name.getFirstName() + " ");
        }
    }
}

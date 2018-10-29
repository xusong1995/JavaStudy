package com.xusong.object.TestFinal;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: final关键字
 * @Data: Created on 2018-10-29 12:49
 */
class T {
    final int i = 8;
//    public void m(final int j) {
//        j = 9;  Error:(12, 9) java: 不能分配最终参数j
//    }

    public final void m() {

    }
}

public class TestFinal {
    public static void main(String[] args) {
        T t = new T();
//        t.i = 9;  Error:(16, 10) java: 无法为最终变量i分配值
    }
}

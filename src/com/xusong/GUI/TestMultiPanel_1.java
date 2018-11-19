package com.xusong.GUI;

import java.awt.*;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 练习
 * @Data: Created on 2018-11-17 15:52
 */
public class TestMultiPanel_1 {
    public static void main(String[] args) {
        new MyFrame2("My Frame with Panel", 300, 300, 400, 400);
    }
}

class MyFrame2 extends Frame {
    //创建4个Panel类型变量
    private Panel p1, p2, p3, p4;

    MyFrame2(String s, int x, int y, int width, int height) {
        //调用父类Frame的构造函数,为Frame分配姓名
        super(s);
        setLayout(null);

        //为4个Panel类型变量分别分配Panel对象
        p1 = new Panel(null);
        p2 = new Panel(null);
        p3 = new Panel(null);
        p4 = new Panel(null);

        //设置各个Panel在Frame中的位置
        p1.setBounds(0, 0, width / 2, height / 2);
        p2.setBounds(width / 2, 0, width / 2, height / 2);
        p3.setBounds(0, height / 2, width / 2, height / 2);
        p4.setBounds(width / 2, height / 2, width / 2, height / 2);

        //设置各个Panel的颜色
        p1.setBackground(new Color(150, 69, 70));
        p2.setBackground(new Color(19, 133, 21));
        p3.setBackground(new Color(0x63ea78));
        p4.setBackground(new Color(0x4d57e7));

        //将各个Panel添加到Frame中
        add(p1);
        add(p2);
        add(p3);
        add(p4);

        //设置Frame位置
        setBounds(x, y, width, height);

        //设置是否可见
        setVisible(true);


    }
}

package com.xusong.GUI;

import java.awt.*;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 课堂练习1(我的程序)
 * @Data: Created on 2018-11-17 16:31
 */
public class Practice_1 {
    public static void main(String[] args) {
        //新建Frame
        new MyFrame3("许松",200,200,800,800);

    }
}

class MyFrame3 extends Frame {
    MyFrame3(String s, int x, int y, int width, int height) {
        //Frame名字
        super(s);
        setLayout(null);

        //新建Panel
        Panel panel = new Panel();
        //Frame位置
        setBounds(x,y,width,height);
        //Panel位置,要求在Frame正中间
        panel.setBounds(width/4,height/4,width/2,height/2);
        //Frame颜色
        setBackground(Color.blue);
        //Panel颜色
        panel.setBackground(Color.YELLOW);
        //加入Frame
        add(panel);
        //设置可见
        setVisible(true);
    }

}

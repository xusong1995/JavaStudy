package com.xusong.GUI;

import java.awt.*;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:
 * @Data: Created on 2018-11-18 16:12
 */
public class TestFlowLayout_2 {
    public static void main(String[] args) {
        //新建一个Frame
        Frame frame = new Frame("测试FlowLayout");
        //新建一个FlowLayout对象
        FlowLayout layout = new FlowLayout(FlowLayout.CENTER, 20, 40);
        //设置Frame的布局方式
        frame.setLayout(layout);
        //设置Frame位置和大小
        frame.setBounds(200, 200, 200, 200);
        //设置Frame背景颜色
        frame.setBackground(Color.cyan);
        //设置Frame为可见
        frame.setVisible(true);

        for (int i = 1; i <= 9; i++) {
            Button button = new Button("BUTTON" + i);
            frame.add(button);
        }
    }
}

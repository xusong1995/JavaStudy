package com.xusong.GUI;

import java.awt.*;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:
 * @Data: Created on 2018-11-18 16:24
 */
public class TestBorderLayout_1 {
    public static void main(String[] args) {
        Frame frame = new Frame("测试BorderLayout");

        Button button1 = new Button("center");
        Button button2 = new Button("north");
        Button button3 = new Button("south");
        Button button4 = new Button("west");
        Button button5 = new Button("east");

        frame.add(button1, BorderLayout.CENTER);
        frame.add(button2, BorderLayout.NORTH);
        frame.add(button3, BorderLayout.SOUTH);
        frame.add(button4, BorderLayout.WEST);
        frame.add(button5, BorderLayout.EAST);

        frame.setBounds(200,200,400,400);
        frame.setVisible(true);
    }
}

package com.xusong.GUI;

import java.awt.*;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:
 * @Data: Created on 2018-11-18 15:33
 */
public class TestFlowLayout_1 {
    public static void main(String[] args) {
        Frame frame = new Frame("测试FlowLayout");
        Button button1 = new Button("OK");
        Button button2 = new Button("OPEN");
        Button button3 = new Button("CLOSE");
        frame.setBounds(200,200,300,300);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,30,30));
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.setVisible(true);
    }
}

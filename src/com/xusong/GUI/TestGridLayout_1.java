package com.xusong.GUI;

import java.awt.*;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:
 * @Data: Created on 2018-11-18 16:51
 */
public class TestGridLayout_1 {
    public static void main(String[] args) {
        Frame frame = new Frame("测试GridLayout");
        frame.setBounds(200,200,300,300);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(3,3));

        for (int i =1;i<=9;i++) {
            Button button = new Button("BUTTON" + i);
            frame.add(button);
        }
        frame.pack();
    }

}

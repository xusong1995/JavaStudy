package com.xusong.GUI;

import java.awt.*;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 笨方法，写死了
 * @Data: Created on 2018-11-17 14:35
 */
public class TestMultiFrame_1 {
    public static void main(String[] args) {
        Frame frame1 = new Frame("My Frame1");
        Frame frame2 = new Frame("My Frame2");
        Frame frame3 = new Frame("My Frame3");
        Frame frame4 = new Frame("My Frame4");
        frame1.setLocation(200, 200);
        frame1.setSize(200, 200);
        frame1.setBackground(Color.green);
        frame1.setVisible(true);
        frame1.setResizable(false);

        frame2.setLocation(400, 200);
        frame2.setSize(200, 200);
        frame2.setBackground(Color.cyan);
        frame2.setVisible(true);
        frame2.setResizable(false);

        frame3.setLocation(200, 400);
        frame3.setSize(200, 200);
        frame3.setBackground(Color.red);
        frame3.setVisible(true);
        frame3.setResizable(false);

        frame4.setLocation(400, 400);
        frame4.setSize(200, 200);
        frame4.setBackground(Color.PINK);
        frame4.setVisible(true);
        frame4.setResizable(false);
    }
}

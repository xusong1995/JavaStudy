package com.xusong.GUI;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:
 * @Data: Created on 2018-11-19 20:51
 */
public class TestWindowClose {
    public static void main(String[] args) {
        new MyFrame_5("测试");
    }
}

class MyFrame_5 extends Frame {
    MyFrame_5(String s) {
        super(s);
        setBackground(Color.cyan);
        setBounds(200, 200, 200, 200);
        setLayout(null);
        setVisible(true);
        this.addWindowListener(new MyWindowMonitor());

//        this.addWindowListener(new WindowAdapter() {
//            public void windowClosing(WindowEvent e) {
//                setVisible(false);
//                System.exit(-1);
//            }
//        });
    }

    class MyWindowMonitor extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            setVisible(false);
            System.exit(-1);
        }
    }
}

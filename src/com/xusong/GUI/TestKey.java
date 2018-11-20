package com.xusong.GUI;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileInputStream;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:
 * @Data: Created on 2018-11-19 22:18
 */
public class TestKey {
    public static void main(String[] args) {
        new KeyFrame().launchFrame();
    }
}

class KeyFrame extends Frame {
    public void launchFrame() {
        setSize(200, 200);
        setLocation(300, 300);
        this.addKeyListener(new MyKeyMonitor());
        setVisible(true);
    }

    class MyKeyMonitor extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            if (keyCode == KeyEvent.VK_UP) {
                System.out.println("upup!");
            }
        }
    }
}

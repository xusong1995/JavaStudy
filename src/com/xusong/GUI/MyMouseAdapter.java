package com.xusong.GUI;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:
 * @Data: Created on 2018-11-19 18:28
 */
public class MyMouseAdapter {
    public static void main(String[] args) {
        new MyFrame_1("测试");

    }
}

class MyFrame_1 extends Frame {
    ArrayList points = null;

    MyFrame_1(String s) {
        //调用父类Frame的构造方法，设置Frame名字
        super(s);
        //创建一个数组队列
        points = new ArrayList();
        //清空布局管理器
        setLayout(null);
        //设置面板位置及大小
        setBounds(300, 300, 400, 300);
        this.setBackground(Color.cyan);
        setVisible(true);
        this.addMouseListener(new Monitor());
    }

    public void paint(Graphics g) {
        Iterator i = points.iterator();
        while (i.hasNext()) {
            Point p = (Point) i.next();
            g.setColor(Color.blue);
            g.fillOval(p.x, p.y, 10, 10);
        }
    }

    public void addPoint(Point p) {
        points.add(p);
    }
}

class Monitor extends MouseAdapter {
    @Override
    public void mousePressed(MouseEvent e) {
        MyFrame_1 frame = (MyFrame_1) e.getSource();
        frame.addPoint(new Point(e.getX(), e.getY()));
        frame.repaint();
    }
}


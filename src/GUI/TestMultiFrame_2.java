package GUI;

import java.awt.*;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 老师的方法
 * @Data: Created on 2018-11-17 15:00
 */
public class TestMultiFrame_2 {
    public static void main(String[] args) {
        MyFrame frame1 = new MyFrame(100, 100, 200, 200, Color.PINK);
        MyFrame frame2 = new MyFrame(100, 300, 200, 200, Color.cyan);
        MyFrame frame3 = new MyFrame(300, 100, 200, 200, Color.GREEN);
        MyFrame frame4 = new MyFrame(300, 300, 200, 200, Color.YELLOW);
    }
}

class MyFrame extends Frame {
    static int id = 0;

    MyFrame(int x, int y, int weight, int height, Color color) {
        super("MyFrame" + (++id));
        //从Frame类继承，可以直接调用方法
        setBackground(color);
        //把内部布局管理器设为空
        setLayout(null);
        setBounds(x, y, weight, height);
        setVisible(true);
    }
}

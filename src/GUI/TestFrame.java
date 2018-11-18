package GUI;

import java.awt.*;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 练习小程序
 * @Data: Created on 2018-11-17 14:25
 */
public class TestFrame {
    public static void main(String[] args) {
        Frame f = new Frame("My First Frame");
        //单位是像素
        f.setSize(570, 500);
        //设置背景色
        f.setBackground(Color.cyan);
        //设定窗口出现时左上角点的坐标的位置,不指定的话在左上角(0,0)的位置
        f.setLocation(300, 300);
        //设置成不可改变窗口大小
        f.setResizable(false);
        //创建窗口只是在内存里创建了一个对象，要想让它显示出来，必须调用 setVisible()方法，参数选 True
        f.setVisible(true);
    }
}

package GUI;

import java.awt.*;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: Panel的用法练习
 * @Data: Created on 2018-11-17 15:26
 */
public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame("许松");
        Panel panel = new Panel(null);

        frame.setLayout(null);
        frame.setBounds(300, 300, 1000, 1000);
        frame.setBackground(new Color(0, 0, 102));
        frame.setVisible(true);

        //相对于Frame的坐标
        panel.setBounds(50, 50, 400, 400);
        panel.setBackground(Color.PINK);
        frame.add(panel);
    }
}

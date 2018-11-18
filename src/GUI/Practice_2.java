package GUI;

import java.awt.*;
import java.io.FileInputStream;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:
 * @Data: Created on 2018-11-18 13:52
 */
public class Practice_2 {
    public static void main(String[] args) {
        new MyFrame_3("许松",200,200,400,400,Color.blue);
    }

}

class MyFrame_3 extends Frame {
    private Panel panel;
    MyFrame_3(String s, int x, int y, int width, int height,Color color) {
        super(s);
        setLayout(null);
        setBounds(x,y,width,height);
        setBackground(color);

        panel = new Panel(null);
        panel.setBounds(width/4,height/4,width/2,height/2);
        panel.setBackground(Color.YELLOW);
        add(panel);
        setVisible(true);
    }
}

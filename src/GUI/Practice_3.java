package GUI;

import java.awt.*;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 课堂练习
 * @Data: Created on 2018-11-18 17:08
 */
public class Practice_3 {
    public static void main(String[] args) {
        new MyFrame_4("测试", 200, 200, 400, 400);
    }
}

class MyFrame_4 extends Frame {
    MyFrame_4(String s,int x,int y,int width,int height) {
        super(s);
        setLayout(new GridLayout(2,3));
        setBounds(x,y,width,height);
        setVisible(true);

        Panel panel1 = new Panel(new GridLayout(1,1));
        panel1.setSize(width/4,height/4);
        Button button1 = new Button("BUTTON");
        panel1.add(button1);

        Panel panel2 = new Panel(new GridLayout(2,1));
        panel2.setSize(width/2,height/2);
        Button button2 = new Button("BUTTON");
        Button button3 = new Button("BUTTON");
        panel2.add(button2);
        panel2.add(button3);

        Panel panel3 = new Panel(new GridLayout(1,1));
        panel3.setSize(width/4,height/4);
        Button button4 = new Button("BUTTON");
        panel3.add(button4);

        Panel panel4 = new Panel(new GridLayout(1,1));
        panel4.setSize(width/4,height/4);
        Button button5 = new Button("BUTTON");
        panel4.add(button5);

        Panel panel5 = new Panel(new GridLayout(2,2));
        panel5.setSize(width/2,height/2);
        Button button6 = new Button("BUTTON");
        Button button7 = new Button("BUTTON");
        Button button8 = new Button("BUTTON");
        Button button9 = new Button("BUTTON");
        panel5.add(button6);
        panel5.add(button7);
        panel5.add(button8);
        panel5.add(button9);

        Panel panel6 = new Panel(new GridLayout(1,1));
        panel6.setSize(width/4,height/4);
        Button button10 = new Button("BUTTON");
        panel6.add(button10);

        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);
        add(panel5);
        add(panel6);

    }
}

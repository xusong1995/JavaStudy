package com.xusong.GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Data: Created on 2018-11-19 16:14
 */
public class TFMath {
    public static void main(String[] args) {
        new TFMathFrame().launchFrame();
    }
}

class TFMathFrame extends Frame {
    TextField number_1, number_2, number_3;

    public void launchFrame() {
        number_1 = new TextField(10);
        number_2 = new TextField(10);
        number_3 = new TextField(15);
        Label label_1 = new Label("+");
        Button button_1 = new Button("=");
        button_1.addActionListener(new MyMonitor());
        setLayout(new FlowLayout());
        add(number_1);
        add(label_1);
        add(number_2);
        add(button_1);
        add(number_3);
        setVisible(true);
        pack();
    }

    class MyMonitor implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int n1 = Integer.parseInt(number_1.getText());
            int n2 = Integer.parseInt(number_2.getText());
            number_3.setText("" + (n1 + n2));
        }
    }
}
/*
class MyMonitor implements ActionListener {
    TFMathFrame tfMathFrame = null;

    MyMonitor(TFMathFrame tfMathFrame) {
        this.tfMathFrame = tfMathFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int n1 = Integer.parseInt(tfMathFrame.number_1.getText());
        int n2 = Integer.parseInt(tfMathFrame.number_2.getText());
        tfMathFrame.number_3.setText("" + (n1 + n2));
    }
}
 */

package com.xusong.GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 密码框
 * @Data: Created on 2018-11-19 11:53
 */
public class TFPassword {
    public static void main(String[] args) {
        new PassFrame();
    }
}

class PassFrame extends Frame {
    PassFrame() {
        TextField textField = new TextField();
        add(textField);
        textField.addActionListener(new TFActionListener2());
        textField.setEchoChar('*');
        pack();
        setVisible(true);
    }
}

class TFActionListener2 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        TextField textField = (TextField)e.getSource();
        System.out.println(textField.getText());
        textField.setText("");
    }
}

package com.xusong.GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:
 * @Data: Created on 2018-11-19 11:35
 */
public class TFActionEvent {
    public static void main(String[] args) {
        new TFFrame();
    }
}

class TFFrame extends Frame {
    TFFrame() {
        //新建一个文本输入框对象
        TextField textField = new TextField();
        //将文本输入框加入到Frame中
        add(textField);
        textField.addActionListener(new TFActionListener());
        pack();
        setVisible(true);
    }
}

class TFActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        TextField textField = (TextField)e.getSource();
        System.out.println(textField.getText());
        textField.setText("");
    }
}
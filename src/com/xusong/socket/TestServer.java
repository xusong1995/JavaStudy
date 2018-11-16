package com.xusong.socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:
 * @Data: Created on 2018-11-15 11:45
 */
public class TestServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            while (true) {
                Socket socket1 = serverSocket.accept();
                OutputStream outputStream = socket1.getOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
                //拿到客户端的IP和端口
                dataOutputStream.writeUTF("Hello," + socket1.getInetAddress() + "port#" + socket1.getPort() + " bye-bye!");
                dataOutputStream.close();
                socket1.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("程序运行出错：" + e);
        }
    }
}

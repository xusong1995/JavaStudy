package com.xusong.socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:
 * @Data: Created on 2018-11-15 11:46
 */
public class TestClient {
    public static void main(String[] args) {
        try {
            Socket socket1 = new Socket("127.0.0.1", 8888);
            InputStream inputStream = socket1.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            System.out.println(dataInputStream.readUTF());
            dataInputStream.close();
            socket1.close();
        } catch (ConnectException connExe) {
            connExe.printStackTrace();
            System.out.println("服务器连接失败！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

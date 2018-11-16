package com.xusong.socket;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:
 * @Data: Created on 2018-11-15 12:13
 */
public class TestSocketClient {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;
        try {
            Socket socket = new Socket("localhost",5888);
            is = socket.getInputStream();
            os = socket.getOutputStream();
            DataInputStream dis = new DataInputStream(is);
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF("hey");
            String s = null;
            if ((s = dis.readUTF())!=null) {
                System.out.println(s);
            }
            dos.close();
            dis.close();
            socket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}

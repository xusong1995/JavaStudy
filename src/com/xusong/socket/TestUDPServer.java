package com.xusong.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:
 * @Data: Created on 2018-11-15 15:30
 */
public class TestUDPServer {
    public static void main(String[] args)throws Exception {
        byte buffer[] = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buffer,buffer.length);
        DatagramSocket ds = new DatagramSocket(5678);
        while (true) {
            ds.receive(dp);
            System.out.println(new String(buffer,0,dp.getLength()));
        }
    }
}

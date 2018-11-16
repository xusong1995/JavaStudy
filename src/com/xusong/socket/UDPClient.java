package com.xusong.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:
 * @Data: Created on 2018-11-15 14:43
 */
public class UDPClient {
    public static void main(String[] args)throws Exception {
        byte[] buffer = (new String("hello")).getBytes();
        DatagramPacket dp = new DatagramPacket(buffer, buffer.length, new InetSocketAddress("127.0.0.1", 5678));
        DatagramSocket ds = new DatagramSocket(9999);
        ds.send(dp);
        ds.close();
    }
}

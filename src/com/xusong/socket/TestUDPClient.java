package com.xusong.socket;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:
 * @Data: Created on 2018-11-15 15:32
 */
public class TestUDPClient {
    public static void main(String[] args) throws Exception {
        long n = 10000L;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(baos);
        dos.writeLong(n);

        byte[] buffer = baos.toByteArray();
        System.out.println(buffer.length);
        DatagramPacket dp = new DatagramPacket(buffer,buffer.length,new InetSocketAddress("127.0.0.1",5678));
        DatagramSocket ds = new DatagramSocket(9999);
        ds.send(dp);
        ds.close();
    }
}

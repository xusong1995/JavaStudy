package com.xusong.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:
 * @Data: Created on 2018-11-08 22:27
 */
public class TestTransform_2 {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String s = null;
        try {
            s = bufferedReader.readLine();
            while (s!=null) {
                if (s.equalsIgnoreCase("exit"))
                    break;
                System.out.println(s.toUpperCase());
                s = bufferedReader.readLine();
            }
            bufferedReader.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
        }
    }


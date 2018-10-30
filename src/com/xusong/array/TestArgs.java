package com.xusong.array;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description:
 * @Data: Created on 2018-10-30 15:26
 */
public class TestArgs {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java Test \"n1\" \"op\" \"n2\" ");
            System.exit(-1);
        }

        double d1 = Double.parseDouble(args[0]);
        double d2 = Double.parseDouble(args[1]);
        double d = 0;

        if (args[1].equals("+")) {
            d = d1 + d2;
        }
        else if (args[1].equals("-")) {
            d = d1 - d2;
        }
        else if (args[1].equals("x")) {
            d = d1 * d2;
        }
        else if (args[1].equals("/")) {
            d= d1 / d2;
        }
        else {
            System.out.println("Error operetor");
            System.exit(-1);
        }
        System.out.println(d);
    }
}

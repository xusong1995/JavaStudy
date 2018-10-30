package com.xusong.exception;

/**
 * @Program: JavaStudy
 * @Author: XuSong
 * @Description: 数组元素的创建和使用
 * @Data: Created on 2018-10-30 11:09
 */
class MyException extends Exception {
    private int id;

    MyException(String message,int id) {
        super(message);
        this.id = id;
    }

    int getId() {
        return id;
    }
}

public class Test {
    void register(int num) throws MyException {
        if (num < 0) {
            throw new MyException("人数为负值,不合理",3);
        }
        System.out.println("登记人数"+num);
    }

    void manager() {
        try {
            register(100);
        } catch (MyException e) {
            System.out.println("登记失败，出错类型码=" + e.getId());
            e.printStackTrace();
        }
        System.out.println("操作结束");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.manager();
    }
}

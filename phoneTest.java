package com.itheima.test;

public class phoneTest {
    public static void main(String[] args) {
        //创建手机的对象
        phone p = new phone();

        //给手机赋值
        p.brand ="xiaomi";
        p.price = 1999.99;

        //获取手机对象中的值
        System.out.println(p.brand);
        System.out.println(p.price);

        //调用手机中的方法
        p.call();
        p.playGame();
    }

}

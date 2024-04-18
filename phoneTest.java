package com.itheima.test;

public class phoneTest {
    public static void main(String[] args) {
        //创建手机的对象
        phone p = new phone();

        //给手机赋值
        //p.brand ="xiaomi";
        //p.price = 1999.99;
        //此时不能之间调用变量,必须调用方法
        p.setBrand("xiaomi");
        p.setPrice(3999.99);
        System.out.println(p.getBrand());
        System.out.println(p.getPrice());


        p.setBrand("huawei");
        p.setPrice(-4999.99);//参数不合法
        System.out.println(p.getBrand());
        System.out.println(p.getPrice());





        //调用手机中的方法
        p.call();
        p.playGame();
    }

}

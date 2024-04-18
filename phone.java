package com.itheima.test;

public class phone {
    //属性
    private String brand;//成员变量
    private double price;

    //封装
    //Priveta关键字
    //针对于每一个私有化的成员变量,都要提供set和get方法
    //set方法:给成员变量赋值
    //get方法:对外提供成员变量的值
    public void setBrand(String brand) {
        //局部变量,表示测试类中调用方法传递过来的数据
        //等号的左边,表示成员变量
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(double price) {
        if (price >= 1000.0 && price <= 10000.0) {
            this.price = price;
        } else {
            System.out.println("参数不合法");
        }
    }

    public double getPrice() {
        return price;
    }

    //行为
    public void call() {
        System.out.println("手机在打电话");
    }

    public void playGame() {
        System.out.println("手机在玩游戏");
    }

}

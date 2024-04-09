package com.itheima.MethodDemo;

public class MethodDemo2 {
    public static void main(String[] args) {
        //需求:定义一个方法,求长方形的面积,将结果在方法中进行打印
        getArea(6.23);
    }
    public static void getArea(double radius){
        double result = radius*radius*3.14;
        System.out.println(result);
    }
}

package com.itheima.IfDemo;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        //需求：键盘录入女婿酒量，如果大于2斤，老丈人给出回应，反之不回应
        //if格式
        //if（关系表达式）{
          //语句体；
        //}
        //如果对一个布尔类型进行判断，不要用==号，直接把变量写在小括号中即可
        //分析：1.键盘录入女婿的酒量
        Scanner sc  = new Scanner(System.in);
        System.out.println("请输入女婿的酒量");
        int wine = sc.nextInt();
        //2.对酒量进行判断
        if (wine>2){
            System.out.println("小伙子，不错哟！");

        }
    }
}

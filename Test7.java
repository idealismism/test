package com.itheima.Test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        /*练习：键盘录入星期数，显示今天的减肥活动，
        周一：跑步
        周二：游泳
        周三：慢走
        周四：单车
        周五：拳击
        周六：爬山
        周日：美食
         */
        //1.键盘录入星期
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入星期数");
        int day = sc.nextInt();
        //2.switch语句匹配
        switch (day) {
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("美食");
                break;
            default:
                System.out.println("没有这个信息");
                break;
        }
    }
}

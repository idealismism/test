package com.itheima.Test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        /*练习：if的第三种格式
        小明的期末数学成绩为95~100分，奖励自行车一辆；
        90~94分，奖励游乐园一次；80~89分，变形金刚一个；
        80分以下，批评教育
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的期末数学成绩");
        int grade = sc.nextInt();
        if (grade >= 0 && grade <= 100) {
            if (grade >= 95 && grade <= 100) {
                System.out.println("奖励自行车一辆");
            } else if (grade >= 90 && grade <= 94) {
                System.out.println("奖励游乐园一次");
            } else if (grade >= 80 && grade <= 89) {
                System.out.println("奖励变形金刚一个");
            } else  {
                System.out.println("进行批评教育");
            }
        }else {
            System.out.println("当前录入成绩不合法");
        }
    }
}

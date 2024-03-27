package com.itheima.Test;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        /*练习 利用case穿刺简化
        键盘录入星期数，输出工作日和休息日
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个星期数");
        int day = sc.nextInt();
        switch (day){
            case 1,2,3,4,5 :
                 System.out.println("工作日");
                 break;
            case 6 ,7 :
                System.out.println("休息日");
                break;
            default:
                System.out.println("没有这个选项");
                break;
        }
        switch (day){
            case 1,2,3,4,5-> System.out.println("工作日");
            case 6,7-> System.out.println("休息日");
            default -> System.out.println("没有这个选项");
        }
    }
}

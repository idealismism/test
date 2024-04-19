package com.itheima.test1;

import java.util.Scanner;

public class LoopTest1 {
    public static void main(String[] args) {
        /*
        判断一个数是否为素数
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个整数");
        int number = sc.nextInt();
        for (int i = 2; i < number;i++) {
            if (number % i == 0) {
                System.out.println(number+"不是一个质数");
                break;
            }
        }
        System.out.println(number+"是一个质数");
    }
}

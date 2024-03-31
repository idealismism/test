package com.itheima.Test;


import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {
        /*
        需求:键盘录入一个大于等于2的整数num.计算并返回num的平方根.
        结果只保留整数,小数部分将被舍去
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个大于等于2的整数");
        int num = sc.nextInt();
        for (int i = 1; i <= num ; i++) {
            if (i * i == num){
                System.out.println("num的平方根为"+i);
                break;
            } else if (i * i > num) {
                i--;
                System.out.println("num的平方根为"+i);
                break;
            }
        }

    }
}

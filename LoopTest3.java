package com.itheima.Test;

import java.util.Scanner;

public class LoopTest3 {
    public static void main(String[] args) {
        /*
        需求:键盘录入一个正整数x,判断该整数是否为质数
        一个数只能被1和他本身整除,则为质数
         */
        //写一个循环,从2开始判断,到num-1结束,看有没有数字可以被num整除
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个正整数");
        int num = sc.nextInt();
        for (int i = 2; i <= num-1 ; i++) {
            if (num % i == 0){
                System.out.println(num+"不是一个质数");
                break;
            }else{
                System.out.println(num+"是一个质数");
            }
        }
    }
}

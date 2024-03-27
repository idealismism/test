package com.itheima.test;

import java.util.Scanner;

public class Text3 {
    public static void main(String[] args) {
        /*数字6是一个伟大的数字，键盘录入两个整数，
        如果其中一个为6，最终结果输出为true,
        如果他们的和为6的倍数，最终结果输出也为true，
        否则为false。*/
        //键盘录入两个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number1 = sc.nextInt();
        System.out.println("请输入一个整数");
        int number2 =sc.nextInt();
        boolean result = number1 == 6 || number2 == 6 || (number1+number2)%6==0;
        System.out.println(result);


    }
}

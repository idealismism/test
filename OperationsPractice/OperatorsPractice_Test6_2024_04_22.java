package OperationsPractice;

import java.util.Scanner;

public class OperatorsPractice_Test6_2024_04_22 {
    public static void main(String[] args) {
      /*
     题目：编写一个Java程序，要求用户输入一个正整数n，然后计算并输出n的阶乘。
要求：
阶乘是指从1到n的所有正整数相乘的结果，记为n!。例如，5的阶乘为5! = 5 * 4 * 3 * 2 * 1 = 120。
用户输入的整数n应该是一个正整数，如果不是，则输出“请输入一个正整数”并结束程序。
程序应该计算并输出n的阶乘。
使用循环结构来计算阶乘。
最后输出结果格式如下：
n的阶乘为：xxx
       */
        Scanner sc = new Scanner(System.in);
        System.out.println("请用户录入一个正整数");
        int positiveNum = sc.nextInt();
        int factorial = 1;
        if (positiveNum > 0) {
            for (int i = positiveNum; i >= 1; i--) {
                factorial *= i;
            }
            System.out.println(positiveNum + "的阶乘为" + factorial);
        }else{
            System.out.println("请输入一个正整数");

        }
        //使用factorial *= i;来累乘
    }
}

package com.itheima.test1;

import java.util.Scanner;

public class IfTest2 {
    public static void main(String[] args) {
        /*判断数字
        输入一个数,如果它大于5,则输出这个数大于5,如果它<=5且>2,则
        输出这个数小于等于5且大于2,
        其他情况输出*
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个整数");
        int number = sc.nextInt();
        if (number > 5) {
            System.out.println("这个数大于5");
        } else if (number <= 5 && number > 2){
            System.out.println("这个数小于等于5且大于2");
        }else{
            System.out.println("*");
        }
    }
}

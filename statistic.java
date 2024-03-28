package com.itheima.Test;

import java.util.Scanner;

public class statistic {
    public static void main(String[] args) {
        //统计满足条件的数字
        //键盘录入两个数字，表示一个范围
        //统计这个范围中，既可以被3整除，又可以被5整除的数字有多少个
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入第一个数字");
        int m = sc.nextInt();
        System.out.println("请录入第二个数字");
        int n = sc.nextInt();
        int number = 0;
        for (int i = m ;i <= n;i++){
            if (i % 3 == 0 && i % 5 == 0){
               number = number + 1;//number++;
            }
        }
        System.out.println(number);
    }
}

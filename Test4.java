package com.itheima.Test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        /*练习：影院选座
        假设某电影院售卖了100张票，序号为1-100，
        其中奇数号坐左边，偶数票坐右边
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("电影票的票号");
        int number = sc.nextInt();
        if (number >= 0 && number <= 100){
            if (number % 2 == 0) {
                System.out.println("坐右边");
            } else {
                System.out.println("坐左边");
            }
        }
    }
}

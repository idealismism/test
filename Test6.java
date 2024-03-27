package com.itheima.Test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        /*练习：假设商品总价为1000元，键盘录入会员级别，
        并计算出实际支付的钱
        1级会员：打9折；2级会员：打8折；3级会员，打7折
        非会员，不打折
         */
        //1.定义变量记录总价
        int price = 1000;
        //1.键盘录入会员的级别
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入会员级别");
        int level = sc.nextInt();
        if (level == 1){
            System.out.println("实际支付的钱="+(price*0.9));
        } else if (level == 2) {
            System.out.println("实际支付的钱="+(price*0.8));
        } else if (level == 3) {
            System.out.println("实际支付的钱="+(price*0.7));
        }else {
            System.out.println("实际支付的钱="+price);
        }
    }
}

package com.itheima.Test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /*在实际开发中，如果要根据两种不同的情况来运行不同的代码，
        就需要用到if的第二种格式
        练习：用户在超市买东西，商品总价为600元，
        键盘录入一个整数表示用户实际支付的钱，
        如果付款大于等于600，表示付款成功，否则付款失败。
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户实际支付的钱");
        int money = sc.nextInt();
        if (money >= 600){
            System.out.println("支付成功");
        }else {
            System.out.println("支付失败");
        }
    }
}

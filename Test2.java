package com.itheima.Test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /*if的第二种格式
        联系：吃饭，键盘录入一个整数，表示身上的钱，如果大于等于100元，吃网红餐厅，
        否则吃小吃
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身上的钱");
        int money = sc.nextInt();
        if (money >= 100){
            System.out.println("吃网红餐厅");
            }else {
            System.out.println("吃小吃");
        }
    }
}

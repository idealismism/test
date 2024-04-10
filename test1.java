package com.itheima.Test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        /*机票价格按照淡季旺季,头等舱和经济舱收费,输入机票原价,月份和头等舱或经济舱
        按照如下规则计算机票价格:旺季(5-10月)头等舱9折,经济舱8.5折;淡季(11月到来年4月)
        头等舱七折,经济舱6.5折
         */
        //分析:
        //1.键盘录入机票原价,月份,头等舱或经济舱
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的原价");
        int ticket = sc.nextInt();
        System.out.println("请输入当前的月份");
        int month = sc.nextInt();
        System.out.println("请输入当前购买的舱位 0 头等舱 1 经济舱");
        int seat = sc.nextInt();
        //2.判断月份是淡季还是旺季
        //ctrl+alt+M自动抽取方法
        if(month >= 5 && month <= 10){
            ticket = getTicket(seat, ticket, 0.9, 0.85);
        } else if ((month >= 11 && month <= 12) ||(month >=1 && month <= 4)) {
            ticket = getTicket(seat, ticket, 0.7, 0.65);
        }else {
            System.out.println("输入月份不合法");
        }
        System.out.println(ticket);

    }

    private static int getTicket(int seat, int ticket, double x, double x1) {
        if (seat == 0) {
            ticket = (int) (ticket * x);
        } else if (seat == 1) {
            ticket = (int) (ticket * x1);
        } else {
            System.out.println("没有这个舱位");
        }
        return ticket;
    }
}

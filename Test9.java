package com.itheima.Test;

import javax.lang.model.util.ElementScanner14;
import javax.swing.*;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        /*
        假设我们拨打了一个机票预定电话，
        电话中语音提示
        1.机票查询
        2.机票预定
        3.机票改签
        4.退出服务
        其他按钮也是退出服务
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个查询内容");
        int choose = sc.nextInt();
        switch (choose){
            case 1 -> System.out.println("机票查询");
            case 2 -> System.out.println("机票预定");
            case 3 -> System.out.println("机票改签");
           // case 4 -> System.out.println("退出服务");
            default -> System.out.println("退出服务");
        }
    }
}

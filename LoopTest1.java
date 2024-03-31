package com.itheima.Test;



public class LoopTest1 {
    public static void main(String[] args) {
        /*需求:聚会游戏:逢7过
        从任意一个数字开始报数,当你要报的数字是包含7或者7的倍数时都要说过
        使用程序在控制台打印出1~100之间满足逢七比过规则的数据
         */
        //1.得到1~100的每一个数字,知道循环的范围,所以用for
        for (int i = 1; i <= 100 ; i++) {
            //2.判断是否满足,满足过,不满足打印数字
            if (i % 10 ==7 || i / 10 % 10 == 7 || i % 7 == 0){
                System.out.println("过");
                continue; //必须有,否则不仅会打印过还会打印数字
            }
            System.out.println(i);
        }

    }
}
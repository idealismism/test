package com.itheima.test1;

public class IfTest1 {
    public static void main(String[] args) {
        /* 闰年计算器
        满足条件之一即为闰年:能被4整除但不能被100整除,或者能被400整除
         */
        int year = 2026;
        if(year>0){
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + "为闰年");
            } else{
                System.out.println(year+"不是闰年");
            }
        }else{
            System.out.println("输入年份不合理");
        }
    }
}

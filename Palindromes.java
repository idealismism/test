package com.itheima.Test;


public class Palindromes {
    public static void main(String[] args) {
        /*需求：
        给定一个整数x
        如果x是一个回文数，打印true；否则，打印false
        回文数：是指从左往右和从右往左读是一样的数
        例如121是回文数，123不是
         */
        int x = 123;//定义一个整数
        int number = 0;//记录倒过来的数
        int temp = x;//记录x原来的值
        while (x!=0){
        int ge = x % 10;//获取个位数取余//3
        x = x / 10; //修改一下记录的值，除以10并且取整，这样就去除了个位数//12
        number = number * 10 + ge;//3,32,321
        }
        System.out.println(number);//打印倒过来的数
        System.out.println(number == temp);//判断是否是回文数
    }
}

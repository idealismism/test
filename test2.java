package com.itheima.Test;

public class test2 {
    public static void main(String[] args) {
        /*判断101~200之间有多少个质数,并打印出所有质数

         */
        //定义一个变量用来统计有多少个质数
        int count = 0;
        //外循环:遍历101~200这个范围,依次得到这个范围内的每一个数字
        for (int i = 101; i <= 200; i++) {
            boolean flag = true;
            //判断i是否为一个质数
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;//跳出单层循环,内循环
                }
            }
            if (flag){
                System.out.println("当前数字"+i+"是质数");
                count++;
            }else {
                System.out.println("当前数字"+i+"不是质数");
            }
        }
        System.out.println("共有"+count+"个质数");
    }
}

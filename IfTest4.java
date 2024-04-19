package com.itheima.test1;

import java.util.Scanner;

public class IfTest4 {
    public static void main(String[] args) {
    /*水仙花数
    判断一个数是否为水仙花数
    所谓水仙花数是指一个三位数.其各位数字立方和等于该数本身.
    例如153=1的三次方+5的三次方+3的三次方,所以153为水仙数
     */
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个三位数的正整数");
        int number = sc.nextInt();
        //1.获取该三位数的各个数位上的数字
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100;
        //2.计算立方和
        int sum = ge * ge * ge + shi * shi * shi + bai * bai * bai;
        if (sum == number) {
            System.out.println(number + "是水仙数");
        } else {
            System.out.println(number + "不是水仙数");
        }

    }
}

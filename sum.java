package com.itheima.Test;

public class sum {
    public static void main(String[] args) {
        //求和
        //1.求1~100的和
        int sum = 0;
        for (int i = 1; i <= 100;i++){
            sum = sum + i;
        }
        System.out.println(sum);
        //2.求1~100的偶数和,快捷：循环的次数.for i
        int sum1 = 0;
        for (int a = 1; a <= 100; a++) {
            if (a % 2 == 0){
                sum1 =sum1 + a;
            }
        }
        System.out.println(sum1);
    }
}

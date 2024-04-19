package com.itheima.test1;

public class LoopTest2 {
    public static void main(String[] args) {
        //输出九九乘法口诀表
        for (int i = 1; i <= 9 ; i++) {
            for (int j = 1; j <= i ; j++) {
                int num = i * j ;
                System.out.print(i+"*"+j+"="+num+" ");
            }
            System.out.println();
        }
    }
}

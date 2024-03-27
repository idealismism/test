package com.itheima.test;

public class Text5 {
    public static void main(String[] args) {
        /*需求：一座寺庙里有三个和尚，已知他们的身高分别为150cm,210cm，165cm，
        请用程序实现获取这三个和尚的最高身高。
         */
        //1，定义三个变量表示三个和尚的身高
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;
        //2.比较,先比较其中两个和尚的身高，再用最大值和第三个和尚进行比较
        //temp 临时变量
        int temp = height1>height2?height1:height2;
        int max = temp >height3?temp:height3;
        System.out.println(max);

    }
}

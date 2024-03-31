package com.itheima.Test;

import java.util.Random;

public class LoopTest6 {
    public static void main(String[] args) {
        //生成随机数random
        Random r = new Random();
        //小括号里写随机数的范围,用bound,bound:100表示0~99.左闭右开,且一定从0开始
       /* for (int i = 0; i <=100 ; i++) {
            int number= r.nextInt(101);//0~100
            System.out.println(number);
        }

        */
       //生成任意数到任意数的随机数列,如7~20
           int num = r.nextInt(14+7);
           //0~13
           //7~20
           System.out.println(num);

    }
}

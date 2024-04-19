package com.itheima.test1;

import java.util.Random;
import java.util.Scanner;

public class IfTest3 {
    public static void main(String[] args) {
        /*猜数字
        随机输入一个1-30的数,然后再输入另一个数,如果此数大于或小于第一个数,
        都有相应的提示,仅当猜对数时判断停止
         */
        Random r = new Random();
        int number1 =r.nextInt(30)+1;
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("请录入一个数");
            int number2 = sc.nextInt();
            if(number2 > number1){
                System.out.println("大了");
            }else if(number2 < number1){
                System.out.println("小了");
            }else{
                System.out.println("恭喜你猜对了");
                break;
            }


        }
    }
}

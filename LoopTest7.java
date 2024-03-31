package com.itheima.Test;


import java.util.Random;
import java.util.Scanner;

public class LoopTest7 {
    public static void main(String[] args) {
        /*
        需求:生成一个1~100的随机数,猜测生成的数字是什么
         */
        Random r = new Random();
        int num = r.nextInt(100+1);
        //0~99
        //1~100
        //生成的随机数不能写在循环里,否则每一次循环都会生成新的随机数
        //不知道循环次数,用while
        /*应用
        抽奖机制
        用点券去抽水晶 保底多少次
        扩展:加一个保底机制,5次猜不中也显示中了
         */
        int count = 0;
        while (true){//true 无限循环
            Scanner sc = new Scanner(System.in);
            System.out.println("请录入猜测的数字");
            int GuessNum = sc.nextInt();
            count++;
            if(count == 5){
                System.out.println("猜中了");
                break;
            }
            if (GuessNum>num){
                System.out.println("猜大了");
            } else if (GuessNum<num) {
                System.out.println("猜小了");
            }else{
                System.out.println("猜中了");
                break;
            }

        }
    }
}

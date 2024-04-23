package OperationsPractice;

import java.util.Scanner;

public class IncrementDecrementOperation_Test4_2024_04_22 {
    public static void main(String[] args) {
        /*
        这个程序要求用户输入一个整数，
        然后使用递增和递减运算符分别对输入的整数进行加一和减一操作，
        并输出结果。
         */
        //1.输入一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个整数");
        int num = sc.nextInt();//12
        //2.使用递增和递减运算符分别对输入的整数进行加一和减一操作
        num++;//13
        num--;//12
        ++num;//13
        --num;//12
        System.out.println(num);//12


    }
}

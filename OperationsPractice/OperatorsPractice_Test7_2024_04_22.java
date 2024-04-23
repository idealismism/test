package OperationsPractice;

import java.util.Scanner;

public class OperatorsPractice_Test7_2024_04_22 {
    public static void main(String[] args) {
         /*
    要求用户输入一个正整数n，然后计算并输出从1到n的所有正整数的平方和
     */
        //1.用户输入一个正整数n
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个正整数");
        int positiveNum = sc.nextInt();
        if (positiveNum <= 0) {
            System.out.println("请输入一个正整数");
            return;
        }
        int sum = 0;
        for (int i = 1; i <= positiveNum; i++) {
            sum += i * i;
        }

        System.out.println("从1到" + positiveNum + "的所有正整数的平方和为：" + sum);
    }
}
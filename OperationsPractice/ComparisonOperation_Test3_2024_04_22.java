package OperationsPractice;

import java.util.Scanner;

public class ComparisonOperation_Test3_2024_04_22 {
    public static void main(String[] args) {
        /*
        这个程序要求用户输入两个整数，
        然后使用比较运算符判断这两个整数是否相等以及它们的大小关系。
        根据比较的结果输出相应的提示信息。
         */
        //1.录入两个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请用户录入第一个整数");
        int num1 = sc.nextInt();
        System.out.println("请用户录入第二个整数");
        int num2 = sc.nextInt();
        //2.使用比较运算符判断这两个整数是否相等以及它们的大小关系
        System.out.println(num1 == num2 ? "相等" : "不相等");
        System.out.println(num1 > num2 ? num1 + "大" : num2 + "大");
    }
}

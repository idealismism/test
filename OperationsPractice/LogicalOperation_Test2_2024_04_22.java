package OperationsPractice;

import java.util.Scanner;

public class LogicalOperation_Test2_2024_04_22 {
    public static void main(String[] args) {
        /*这个程序要求用户输入一个整数，然后使用逻辑运算符判断该整数是否是正数且是偶数。
        如果判断条件成立，则输出相应的提示信息；否则输出另一条提示信息。
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请用户录入一个整数");
        int number = sc.nextInt();
        System.out.println(number + "是" + ((number > 0 && (number & 2) == 0) ? "正数且是偶数" : "其他"));
        //
        boolean isPositive = number > 0;
        boolean isEven = number % 2 == 0;

        if (isPositive && isEven) {
            System.out.println(number + " 是正数且是偶数。");
        } else {
            System.out.println(number + " 不是正数且是偶数。");
        }
    }
}

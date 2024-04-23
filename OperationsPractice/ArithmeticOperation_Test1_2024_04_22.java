package OperationsPractice;

import java.util.Scanner;

public class ArithmeticOperation_Test1_2024_04_22 {
    public static void main(String[] args) {
        /*题目：编写一个Java程序，要求用户输入两个整数，然后进行以下操作：
        计算并输出这两个整数的和、差、积、商（保留两位小数）。
        判断并输出其中较大的数和较小的数。
        判断并输出这两个整数的奇偶性。
         */
        //1.生成两个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请用户录入第一个整数");
        int number1 = sc.nextInt();
        System.out.println("请用户录入第二个整数");
        int number2 = sc.nextInt();
        //2.计算两个整数的和、差、积、商（保留两位小数）。
        //特别注意保留两位小数的写法:%.2f\n
        int sum = number1 + number2;
        int difference = number1 - number2;
        int product = number1 * number2;
        double quotient = (double) number1 / number2;
        System.out.println("和：" + sum);
        System.out.println("差：" + difference);
        System.out.println("积：" + product);
        System.out.printf("商：%.2f\n", quotient);

        //3.判断并输出其中较大的数和较小的数
        if (number1 > number2) {
            System.out.println("较大的数为" + number1 + "," + "较小的数为" + number2);
        } else {
            System.out.println("较大的数为" + number2 + "," + "较小的数为" + number1);
        }
        //
        int max = Math.max(number1, number2);
        int min = Math.min(number1, number2);
        System.out.println("较大的数是：" + max);
        System.out.println("较小的数是：" + min);
        //4.判断并输出这两个整数的奇偶性。
        if (number1 % 2 == 0) {
            System.out.println(number1 + "为偶数");
        } else {
            System.out.println(number1 + "为奇数");
        }
        if (number2 % 2 == 0) {
            System.out.println(number2 + "为偶数");
        } else {
            System.out.println(number2 + "为奇数");
        }
        //
        System.out.println(number1 + "是" + (number1 % 2 == 0 ? "偶数" : "奇数"));
        System.out.println(number2 + "是" + (number2 % 2 == 0 ? "偶数" : "奇数"));
    }
}

package If_Loop_Practice_2024_04_24;

import java.util.Scanner;

public class If_Loop_test3 {
    public static void main(String[] args) {
        /*
        编写一个 Java 程序，实现以下功能：
        提示用户输入一个正整数 N。
        使用循环计算并输出 1 到 N 的所有数字的平方和。
        判断平方和是否为偶数，如果是偶数则输出"平方和是偶数"，否则输出"平方和不是偶数"。
         */
        //用户输入一个正整数N。
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个正整数N");
        int N = sc.nextInt();
        if (N <= 0) {
            System.out.println("请录入一个大于0的整数");
            return;
        }
        //使用循环计算并输出 1 到 N 的所有数字的平方和
        int square;
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            square = i * i;
            sum = sum + square;
        }
        System.out.println("1到N所有数字的平方和为" + sum);
        //判断平方和是否为偶数，如果是偶数则输出"平方和是偶数"，否则输出"平方和不是偶数"
        boolean isEven = sum % 2 == 0;
        if (isEven) {
            System.out.println("平方和是偶数");
        } else {
            System.out.println("平方和不是偶数");
        }

    }
}

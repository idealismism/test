package If_Loop_Practice_2024_04_24;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        /*
        这个程序通过用户输入的数字 N，输出斐波那契数列的前 N 个数字。
        程序使用了 for 循环和两个变量 a、b 来计算并输出斐波那契数列。
       斐波那契数列是一个经典的数学序列，以意大利数学家斐波那契（Fibonacci)的名字命名。
       这个序列从 0 和 1 开始，后续的每个数字都是前两个数字之和。
       换句话说，斐波那契数列的定义如下：
       第0个数字是0
       第1个数字是1
       从第2个数字开始，每个数字都是前两个数字之和
      因此，斐波那契数列的前几个数字依次为：0, 1, 1, 2, 3, 5, 8, 13, 21, ... 以此类推。
         */
        //用户输入一个正整数N。
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要输出的斐波那契数列的前 N 个数字：");
        int N = sc.nextInt();

        int a = 0, b = 1;
        System.out.println("斐波那契数列的前 " + N + " 个数字为：");

        for (int i = 0; i < N; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println();
        }
    }

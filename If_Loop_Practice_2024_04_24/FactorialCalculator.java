package If_Loop_Practice_2024_04_24;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        /*
        要求用户输入一个正整数n，然后程序计算并输出n的阶乘
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个正整数");
        int num = sc.nextInt();
        if(num <= 0){
            System.out.println("请录入一个大于0的整数");
            return;
        }
        int factorial = 1;
        for (int i = num; i >= 1 ; i--) {
            factorial*=i;
        }
        System.out.println(num+"的阶乘为"+factorial);
    }
}

package If_Loop_Practice_2024_04_24;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        /*
        要求用户输入一个正整数n，然后程序判断并输出该数是否为素数（质数）
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个正整数");
        int num = sc.nextInt();
        //1既不是质数也不是合数,因此从2开始判断
        if (num <= 1) {
            System.out.println("请录入一个大于等于1的正整数");
            return;
        }
        //判断一个数是否为质数,从2到这个数的前一个,能被这个数整除,则不是质数

        /*for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println(num + "不是质数");
                break;
                //有一个能整除,就说明不是质数,就可以结束循环
            } else {
                System.out.println(num + "是质数");
            }
        }

         */

        //计算平方根
        System.out.println(Math.sqrt(num));
        //判断方法二:
        boolean isPrime = true;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + "是质数");
        } else {
            System.out.println(num + "不是质数");
        }
    }
}


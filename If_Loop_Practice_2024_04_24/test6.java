package If_Loop_Practice_2024_04_24;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        /*
        编写一个程序，要求用户输入一个正整数 N，
        然后程序输出从 1 到 N 的所有数字中能被 3 整除但不能被 5 整除的数字的平均值。
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个正整数N");
        int N = sc.nextInt();
        System.out.println("从 1 到 N 的所有数字中能被 3 整除但不能被 5 整除的数字有:");
        int sum = 0;
        int count =0;
        for (int i = 1; i <= N ; i++) {
            if(i % 3 == 0 && i % 5 != 0){
                System.out.print(i+" ");
                sum = sum + i;
                count++;
            }
        }
        System.out.println();
        if (count != 0) {
            double average = (double) sum / count;
            System.out.println("从 1 到 " + N + " 的所有能被 3 整除但不能被 5 整除的数字的平均值为：" + average);
        } else {
            System.out.println("在 1 到 " + N + " 范围内没有符合条件的数字。");
        }
    }
}

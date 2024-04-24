package If_Loop_Practice_2024_04_24;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        /*
        要求用户输入一个整数 N，然后程序输出从 1 到 N 的所有奇数
         */
        //用户输入一个正整数N。
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个正整数N");
        int N = sc.nextInt();
        if (N <= 0) {
            System.out.println("请录入一个大于0的整数");
            return;
        }
        System.out.println("从1到"+N+"的所有奇数为:");
        //输出从 1 到 N 的所有奇数
        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0){
                System.out.print(i+" ");
            }

        }
    }
}

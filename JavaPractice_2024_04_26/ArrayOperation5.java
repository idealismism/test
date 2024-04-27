package JavaPractice_2024_04_26;

import java.util.Scanner;

public class ArrayOperation5 {
    public static void main(String[] args) {
        /*
        题目：编写一个 Java 程序，要求用户输入一个整数 n，
        然后生成一个长度为 n 的整型数组，
        数组中的元素为 1 到 n 的平方，然后计算并输出这个数组中所有元素的和。
         */
        //用户通过 Scanner 输入一个整数 n
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数n");
        int n = sc.nextInt();
        //创建一个长度为 n 的整型数组 arr
        int[] arr = new int[n];
        //使用循环填充数组 arr，使数组中的元素为 1 到 n 的平方。
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i+1)*(i+1);
        }
        System.out.print("该数组为:");
        //遍历数组 arr，输出数组中的所有元素，并计算数组中所有元素的和。
        int sum = 0;
        for (int j : arr) {
            System.out.print(j + " ");
            sum+=j;
        }
        System.out.println();
        System.out.println("该数组中所有元素的和为"+sum);

    }
}

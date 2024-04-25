package ArrayPractice_2024_04_25;

import java.util.Random;

public class ArrayPractice1 {
    public static void main(String[] args) {
        /*
        编写一个程序，实现以下功能：
        定义一个整型数组，随机生成 10 个 1 到 100 之间的整数存入数组中，
        然后计算并输出这 10 个整数的平均值、最大值和最小值。
         */
        //定义一个整型数组，随机生成 10 个 1 到 100 之间的整数存入数组中
        Random r = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(100) + 1;
            arr[i] = num;
        }
        System.out.println("随机生成的数组为:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //计算并输出这 10 个整数的平均值、最大值和最小值。
        System.out.println("该数组的均值为"+getAve(arr));
        System.out.println("该数组的最大值为"+getMax(arr));
        System.out.println("该数组的最小值为"+getMin(arr));


    }

    /**
     * 找到数组的均值
     *
     * @param arr 输入数组
     * @return 均值
     */
    public static double getAve(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }

    /**
     * 找到数组的最大值
     *
     * @param arr 输入数组
     * @return 最大值
     */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 找到数组的最小值
     * @param arr 输入数组
     * @return 最小值
     */
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}


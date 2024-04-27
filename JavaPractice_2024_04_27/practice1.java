package JavaPractice_2024_04_27;


import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        /*
        1. 输入10位同学的java成绩：(1)求平均成绩，最高成绩、最低成绩；
        (2)对10的成绩按照从低到高的顺序排列（选做）
         */
        //输入10位同学的java成绩
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("请输入10位同学的成绩：");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        //调用方法获取平均成绩，最高成绩、最低成绩
        System.out.println("10位同学的平均成绩为" + getAverage(arr));
        System.out.println("10位同学的最高成绩为" + getMax(arr));
        System.out.println("10位同学的最低成绩为" + getMin(arr));
        //排序
        int[] newArr = getSort(arr);
        for (int j : newArr) {
            System.out.print(j + " ");
        }

    }

    /**
     * 写一个方法用来获取平均成绩
     */
    public static double getAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return (double) sum / arr.length;
    }

    //写一个方法用来获取最高成绩

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //写一个方法用来获取最低成绩
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * 写一个方法用来排序
     * 使用冒泡排序
     */
    public static int[] getSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}

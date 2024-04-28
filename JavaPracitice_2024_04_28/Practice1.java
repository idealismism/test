package JavaPracitice_2024_04_28;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        /*
        3. 给定一个数组，大小为10，输入十个同学的成绩，求这些成绩的总分数；
        某一天转入2个新同学，请再次求12个同学的平均成绩（尝试着使用扩容的形式做）
         */
        //输入十个同学的成绩哦
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入十个同学的成绩:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //求十个同学的总分数
        int sum = getSum(arr);
        System.out.println("十个同学的总成绩为:" + sum);
        //求12个同学的成绩
        int[] newArr = arrayList(arr,2);
        System.out.println("十二个同学的成绩分别为:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
        //求十二个同学的平均成绩
        int sum1 = getSum(newArr);
        double average = (double) sum1 / newArr.length;
        System.out.println("十二个同学的平均成绩为:"+average);


    }

    /**
     * 数组求和
     */
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /**
     * 数组扩容,在原来的数组基础上新增元素个数
     */
    public static int[] arrayList(int[] arr,int numNewStudents) {
        int[] newArr = new int[arr.length + numNewStudents];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < newArr.length; i++) {

            if (i < arr.length) {
                newArr[i] = arr[i];
            } else {
                System.out.println("请录入新增同学的成绩");
                newArr[i] = sc.nextInt();
            }
        }
        return newArr;
    }

}

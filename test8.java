package com.itheima.Test;

import java.util.Random;
import java.util.Scanner;

public class test8 {

    public static void main(String[] args) {
        /*双色球中奖条件和奖金
        投注号码由6个红色球和1个蓝色球号码组成.红色球号码从1-33中选择,
        蓝色球号码从1-16中选择
         */
        //1.生成中奖号码
        int[] arr = creatNumber();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("===========");
        //2.录入用户的号码(红球+蓝球)
        int[] arr1 = userInputNumber();
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        //3.判断用户的中奖情况
        int redCount = 0;
        int blueCount = 0;
        //判断红球的个数
        for (int i = 0; i < arr1.length - 1; i++) {
            int redNumber = arr1[i];
            for (int i1 = 0; i1 < arr.length - 1; i1++) {
                if (redNumber == arr[i]) {
                    redCount++;
                    //如果找到一个相等的,则退出内循环,不需要继续比较了,进行外循环,比较下一个号码即可
                    break;
                }
            }
        }
        System.out.println("红色球有" + redCount + "个");
        //判断蓝色球的个数
        int blueNumber = arr1[arr1.length - 1];
        if (blueNumber == arr[arr.length - 1]) {
            blueCount++;
        }
        System.out.println("蓝色球有" + blueCount + "个");
        //根据红色球和蓝色球的个数判断中奖情况
        boolean b = redCount == 4 && blueCount == 1;
        if (redCount == 6 && blueCount == 1){
            System.out.println("恭喜你,中奖1000万");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜你,中奖500万");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜你,中奖3000元");
        }else if ((redCount == 5 && blueCount == 0)||(redCount == 4 && blueCount == 1))  {
            System.out.println("恭喜你,中奖200元");
        } else if ((redCount == 4 && blueCount == 0)||(redCount == 3 && blueCount == 1)) {
            System.out.println("恭喜你,中奖10元");
        } else if ((redCount == 2 && blueCount == 1)||(redCount == 1 && blueCount == 1)||(redCount == 0 && blueCount == 1)) {
            System.out.println("恭喜你,中奖5元");
        }else {
            System.out.println("抱歉,感谢您的参与");
        }
    }


    public static int[] userInputNumber() {
        Scanner sc = new Scanner(System.in);
        //创建数组记录用户输入的号码
        int[] arr = new int[7];
        for (int i = 0; i < 6; ) {
            System.out.println("请用户录入第" + (i + 1) + "个红色球号码");
            int userInputRed = sc.nextInt();
            if (userInputRed >= 1 && userInputRed <= 33) {
                boolean flag = contain(arr, userInputRed);
                if (!flag) {
                    arr[i] = userInputRed;
                    i++;
                } else {
                    System.out.println("您录入的号码已经存在,请重新录入");
                }
            } else {
                System.out.println("号码超出范围,请重新录入");
            }
        }
        while (true) {
            System.out.println("请用户录入蓝色球号码");
            int userInputBlue = sc.nextInt();
            if (userInputBlue >= 1 && userInputBlue <= 16) {
                arr[arr.length - 1] = userInputBlue;
                break;
            } else {
                System.out.println("号码超出范围,请重新输入");
            }
        }
        return arr;
    }

    public static int[] creatNumber() {
        Random r = new Random();
        //随机生成7个号码,然后存入数组中
        //6红1蓝
        int arr[] = new int[7];
        for (int i = 0; i < arr.length - 1; i++) {
            int redNumber = r.nextInt(33) + 1;
            boolean flag = contain(arr, redNumber);
            //不重复,放入数组,重复则继续生成
            if (!flag) {
                arr[i] = redNumber;
            }
        }
        int blueNumber = r.nextInt(16) + 1;
        arr[arr.length - 1] = blueNumber;
        return arr;
    }

    public static boolean contain(int[] arr, int number) {
        //判断生成的元素是否重复
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}

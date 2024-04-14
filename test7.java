package com.itheima.Test;

import java.util.Random;

public class test7 {
    public static void main(String[] args) {

     /*抢红包
     一个大V直播间抽奖,奖品是现金红包,分别有[2,588,,888,1000,10000]五个奖金,
     请使用代码模拟抽奖,打印出每个奖项,奖项的出现顺序要随机且不重复
      */
        //方法二:先打乱顺序,再遍历奖池
        int[] arr = {2, 588, 888, 1000, 10000};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] =temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
       /* int[] arr = {2, 588, 888, 1000, 10000};
        int[] newArr = new int[arr.length];
        Random r = new Random();
        for (int i = 0; i < arr.length; ) {
            int randomIndex = r.nextInt(arr.length);
            int price = arr[randomIndex];
            boolean flag = contain(newArr, price);
            if (!flag) {
                newArr[i] = price;
                i++;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }

    }

    public static boolean contain(int[] arr, int price) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == price) {
                return true;
            }

        }
        return false;


        */
    }
}


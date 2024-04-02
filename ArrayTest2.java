package com.itheima.Test;

import java.util.Random;

public class ArrayTest2 {
    public static void main(String[] args) {
        /*需求:生成10个1~100之间的随机数存入数组
        1)求出所有数据的和
        2)求所有数据的平均数
        3)统计有多少个数比平均数小
         */
        //1.定义数组,存储10个,选择动态
        int[] arr =new int[10];
        //2.把随机数存储到数组当中
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //每循环一次就会生成一组新的随机数
            int number = r.nextInt(100)+1;
            //将生成的随机数添加到数组当中
            arr[i]=number;
        }
        //注意:一次循环最好只做一件事情
        //3.遍历数组
        /*for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

         */
        //3.求出所有数据的和
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum = sum + arr[i];
        }
        System.out.println("数据的和为"+sum);
        //4.求出所有数据的平均数
        double average = sum / 10.0;
        System.out.println("数据的平均数为"+average);
        //5.统计有多少个数据小于平均数
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] < average){
                count++;
            }
        }
        System.out.println("在数组中,一共有"+count+"个数字比平均数小");

        //遍历数组,验证答案
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
            //删掉ln ,打印不会换行
        }
    }
}

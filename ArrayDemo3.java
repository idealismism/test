package com.itheima.ArrayDemo;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //数组遍历
        //1.定义数组
        int[] arr = {1,2,3,4,5};
       /* System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        */

        //当数据很多时过于繁琐
        //引用for循环,开始:arr[0],介绍arr[4]
       /*for (int i = 0; i < 5 ; i++) {
            System.out.println(arr[i]);
        }
        */

        //当数据很多时怎么知道数组长度
        //调用方式:数组名.length
        System.out.println(arr.length);//5
        //快捷键:arr.fori
        for (int i = 0; i < arr.length; i++) {
            //0 ,1 , 2 ,3 ,4
            System.out.println(arr[i]);
        }

    }
}

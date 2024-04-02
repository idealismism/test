package com.itheima.ArrayDemo;

public class ArrayDemo4 {
    public static void main(String[] args) {
        /*数组的动态初始化
        定义一个数组,用来存班级中50个学生的姓名
        姓名未知,学生报道之后在进行添加
         */
        String[] arr = new String[50];
        arr[0]="zhangsan";
        arr[1]="lisi";
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //数组默认初始化规律
        //整数:0
        //小数:0.0
        //字符:'/u0000'空格
        //布尔:false
        //引用数据类型:null
        int[] arr2 = new int[3];
        System.out.println(arr2[0]);
    }
}

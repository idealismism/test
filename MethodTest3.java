package com.itheima.Test;

public class MethodTest3 {
    public static void main(String[] args) {
        /*需求:数组遍历
        设计一个方法用于数组遍历,要求遍历的结果在一行上
        例如[11,22,33,44,55]
         */
        //定义数组
        int[] arr ={11,22,33,44,55};
        //调用方法遍历数组
        printArr(arr);
    }
    //定义方法用于数组的遍历
    //1.要干嘛 数组遍历
    //2,需要什么  数组
    //3.方法的调用是否需要继续使用结果  不需要返回值
    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i]+",");
            }
        }
        System.out.print("]");
        /*
        System.out.println("abc");//先打印abc,再换行
        System.out.print("abc");//纸打印abc,不换行
        System.out.println();//不打印任何数据,只做换行处理
         */
    }
}

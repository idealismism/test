package com.itheima.Test;

public class ArrayTest3 {
    public static void main(String[] args) {
        /*需求:定义一个数组,存入1,2,3,4,5.按要求交换索引对应的元素
        交换前:1,2,3,4,5
        交换后:5,4,3,2,1
         */
        //首先进行交换一个元素
        //利用一个临时变量
        /*int[] arr = {1,2,3,4,5};
        int temp = arr[4];
        arr[4] = arr[0];
        arr[0] = temp;
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);//5,2,3,4,1
        }

         */
        int[] arr ={1,2,3,4,5};
        for (int i = 0,j = arr.length -1; i < j ; i++,j--) {
            int temp = arr[i];
            arr[i] =arr[j];
            arr[j] =temp;
         }
        //当循环后,那么数据中的数据就倒过来了
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

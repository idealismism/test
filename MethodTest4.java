package com.itheima.Test;


public class MethodTest4 {
    public static void main(String[] args) {
        /*
        设计一个方法求数组的最大值,并将最大值返回
         */
        int[] arr ={111,22,44,5,66,99};
        int result = getLarge(arr);
        System.out.println("该组数据最大值为"+result);
    }
    public static int  getLarge(int[] arr){
        int large = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > large){
                large = arr[i];
            }

        }
        return large;
    }

}

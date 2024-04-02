package com.itheima.Test;

public class ArrayTest1 {
    public static void main(String[] args) {
        //求数组中的最大值
        //max的初始化值要是数组中的值
        int[] arr = new int[]{33,5,22,44,55};
        int max = arr[0];
        for (int i = 1; i < 5 ; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("数组中的最大值为"+max);
        //求数组中的最小值
        int [] arr1 = new int[]{77,33,44,55,66};
        int min = arr1[0];
        for (int a = 1; a < 5 ; a++) {
            if(arr1[a] < min) {
                min = arr1[a];
            }
        }
        System.out.println("数组中的最小值为"+min);
    }
}

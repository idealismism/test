package com.itheima.Test;

public class ArrTest1 {
    public static void main(String[] args) {
        //需求:定义一个数组,存储1,2,3,4,5
        //遍历数组里的每一个元素,并求和
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum +arr[i];
        }
        System.out.println(sum);
    }
}

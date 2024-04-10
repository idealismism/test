package com.itheima.Test;

public class test4 {
    public static void main(String[] args) {
        //数组元素的复制
        //把一个数组中的元素复制到另一个新数组中去
        //分析
        //定义一个数组
        int[] arr = {1,2,3,4,5};
        //定义一个新数组和老数组的长度一致
        int[] newArr = new int[arr.length];
        //遍历老数组,得到老数组中的每一个元素,依次存到新数组当中
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        //遍历新数组
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}

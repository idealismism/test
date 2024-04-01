package com.itheima.Test;

public class ArrTest2 {
    public static void main(String[] args) {
        /*
        需求:定义一个数组,1,2,3,4,5,6,7,8,9,10
        遍历数组中的每一个元素,判断能被3整除的元素有几个
         */
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            //i表示索引
            //arr[i]才是数组里的每一个数
            if (arr[i] % 3 == 0){
               // System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println("该数组中能被3整除的数有"+count+"个");

    }
}

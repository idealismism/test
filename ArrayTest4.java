package com.itheima.Test;

import java.util.Random;

public class ArrayTest4 {
    public static void main(String[] args) {
        /*打乱数组中的数据
        需求:定义一个数组,存入1~5,要打乱数组中所有数据的顺序
         */

       /*难点:如何获取数组中的随机索引
        int[] arr ={1,2,3,4,5};
        Random r = new Random();
        int randomIndex = r.nextInt(arr.length);
        System.out.println(randomIndex);
        */

        //1.定义数组存储1~5
        int[] arr ={1,2,3,4,5};
        //2.循环遍历数据,从0索引开始打乱数据的顺序
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //生成一个随机索引
            int randomIndex = r.nextInt(arr.length);
            //拿着随机索引指向的元素 跟i指向的元素进行交换
            int temp =arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex]=temp;
            //当循环结束之后,那么数据中所有的数据已经打乱顺序了
        }
        for (int i1 = 0; i1 < arr.length; i1++) {
            System.out.print(arr[i1]+" ");
        }
    }
}

package com.itheima.ArrayDemo;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //利用索引对数组中的元素进行访问
        //1.获取数组里面的元素
        // 格式:  数组名[索引]
        int[] arr = {1, 2, 3, 4, 5};
        int number = arr[0];//索引就是角标,从0开始逐次加1,arr[0]就是数组中的第一个元素
        System.out.println(number);//1
        System.out.println(arr[1]);//2
        //2.把数据存储到数组中
        //格式: 数组名[索引]=具体数据/变量;
        //细节:一旦覆盖之后,原来的数据就不存在了
        arr[0] = 100;
        System.out.println(arr[0]);
    }
}

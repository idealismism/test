package com.itheima.TwoDimensionDemo;

public class TwoDimensionDemo1 {
    public static void main(String[] args) {
        //二维数组
        //二维数组的静态初始化
        //1.格式
        //数据类型[][]数组名=new 数据类型[][] {{元素1 ,元素2},{元素3,4,5}};
        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6, 7, 8}};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6, 7, 8}};
        //为了方便阅读,建议把每一个数组单独定义一行
        int[][] arr = {
                {1,2,3},
                {4,5,6,7,8}
        };
        //2.获取元素
        //arr[i][j]
        //arr:二维数组
        //i:二维数组的索引,获取出来的是里面的一维数组
        //j:表示一维数组的索引,获取出来的是里面的元素
        //System.out.println(arr[0]);//获取出来的是二维数组中的第一个一维数组的地址值
       // System.out.println(arr[0][0]);//第一个数组中的0索引的元素
       // System.out.println(arr[1][4]);//8
        //3.二维数组遍历
        //外循环,遍历二维数组,得到里面的每个一维数组
        for (int i = 0; i < arr.length; i++) {
            //i:表示二维数组的每一个索引
            //arr[i]:表示二维数组中的每一个元素,即一维数组
            //内循环:遍历一维数组,得到里面的每一个元素
            for (int i1 = 0; i1 < arr[i].length; i1++) {
                System.out.print(arr[i][i1]+" ");
            }
            System.out.println();
        }

    }
}

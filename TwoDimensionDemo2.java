package com.itheima.TwoDimensionDemo;

public class TwoDimensionDemo2 {
    public static void main(String[] args) {
        //二维数组的动态初始化
        //格式:数据类型[][] 数组名 = new 数据类型[m][n];
        //m:表示这个二维数组可以存放多少个一维数组
        //n:表示每个一维数组中可以存放多少个元素
        int[][] arr = new int[3][5];
        arr[0][0] = 10;
        arr[1][4] = 10;
        arr[2][3] = 10;
        //遍历
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr[i].length; i1++) {
                System.out.print(arr[i][i1]+" ");
            }
            System.out.println();
        }
    }
}

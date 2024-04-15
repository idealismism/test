package com.itheima.Test;

public class TwoDimensionTest {
    public static void main(String[] args) {
        /*二位数组练习
        某商城每个季度的营业额如下:单位(万元)
        第一季度:22,66,44
        第二季度:77,33,88
        第三季度:25,45,65
        第四季度:11,66,99
        要求计算出每个季度的总营业额和全年的总营业额
         */
        int[][] yearArr = {
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99},
        };
        int yearSum = 0;
        for (int i = 0; i < yearArr.length; i++) {
            //定义季度数组记录二维数组的每一个索引,即一维数组
           int[] quarterArr = yearArr[i];
           int sum = getSum(quarterArr);
            System.out.println("第"+(i+1)+"季度营业额为"+sum);
            yearSum = yearSum + sum ;
            System.out.println("全年的营业额为"+yearSum);
        }

    }
    public static int getSum(int[] arr){
        //定义一个方法,计算每个季度的营业额
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum ;
    }
}

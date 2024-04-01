package com.itheima.ArrayDemo;


public class ArratDemo1 {
    public static void main(String[] args) {
        /*
        数据类型[]数组名= new 数组名[]{元素1,元素2...}
        简化
        数据类型[]数组名={元素1,元素2...}
         */
        //需求1:定义数组储存五个学生的年龄
        int[] arr1 = new int[]{20,21,22,23,24};
        int[] arr2 = {20,21,22,23,24};
        //需求2:定义数组储存三个学生的姓名
        String[] arr3 = new String[]{"zhangsan","lisi","wangwu"};
        String[] arr4 = {"zhangsan", "lisi", "wangwu"};
        //需求3:定义数组存储4个学生的身高
        double[] arr5 = new double[]{19.1,18.8,17.6,15.9};
        double[] arr6 = {19.1,18.8,17.6,15.9};
        System.out.println(arr6);//[D@b4c(966a 地址值
        /*扩展
        [ : 表示当前是一个数组
        D : 表示数组里面的类型都是double类型的
        @ : 表示一个间隔符号(固定格式)
        b4c966a : 数组真正的地址值 (十六进制)
        平时我们习惯性的会把这个整体称为地址值
         */
    }
}

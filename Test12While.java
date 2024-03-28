package com.itheima.Test;

public class Test12While {
    public static void main(String[] args) {
        /*打印折纸的次数
        珠穆朗玛峰的高度是8844.43米=8844430毫米，已知一张纸的厚度是0.1毫米
        问折叠多少次纸的厚度大于珠穆朗玛峰的高度
        因为不知道循环次数，所以选用while循环
         */
        //1.定义珠穆朗玛峰的高度
        int height = 8844430;
        //2.定义纸张厚度
        double paper = 0.1;
        //3.定义折叠次数
        int count = 0;
        while (paper < height){
            paper = paper * 2;
            count++;
        }
        System.out.println(count);
    }
}

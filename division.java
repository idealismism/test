package com.itheima.Test;

public class division {
    public static void main(String[] args) {
        /*
        需求：给定两个整数，被除数和除数，都是正数，且不超过int的取值范围
        将两数相除，要求不使用乘法，除法和%
        得到商和余数
        */
        int b = 11;//定义被除数
        int c = 5;//定义除数
        int count = 0;
        while (b >= c){
            b = b -c;//11-5=6,b=6,c=5,6-5=1,b=1,c=5
            count++;
        }
        System.out.println("余数为"+b);//余数
        System.out.println("商为"+count);//商
    }


}


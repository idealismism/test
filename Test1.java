package com.itheima.Test;

public class Test1 {
    public static void main(String[] args) {
        //练习：自动驾驶
        //1.定义三个变量表示灯的状态
        boolean isLightGreen = false;
        boolean isLightYellow = false;
        boolean isLightRed = true;
        //2.判断
        if(isLightGreen) {
            System.out.println("gogogo!!!");
        }
        if(isLightYellow){
            System.out.println("slow!!!");
        }
        if (isLightRed){
            System.out.println("stop!!!");
        }
        if (isLightGreen){
            System.out.println("gogogo!!!");
        } else if (isLightYellow){
            System.out.println("slow");
        }else{
            System.out.println("stop");
        }
    }
}

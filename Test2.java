package com.itheima.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /*需求:
        你和你的约会对象正试图在餐厅获得一张桌子;
        键盘录入俩个整数,表示你和你对象衣服的时髦度,(手动录入0-10之间的
        整数),如果你的时髦度大于你对象的时髦度,相亲就成功,输出true.
         */
        //1.键盘录入俩个整数表示衣服的时髦度
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入我们自己的衣服时髦度");
        int myfashion =sc.nextInt();
        System.out.println("请输入相亲对象衣服的时髦度");
        int hisfashion = sc.nextInt();
        //2.对比
        boolean result = myfashion > hisfashion;
        //3.打印结果
        System.out.println(result);
    }
}

package com.itheima_JavaBean_05_10.test3;

import java.util.Scanner;

public class scannerTest {
    public static void main(String[] args) {
        //键盘录入
        //第一套体系:
        //nextInt();接收整数
        //nextDouble();接收小数
        //next();接收字符串
        //遇到空格,制表符,回车就停止接收,这些符号后面的数据就不会接受了

        //第二套体系:
        //nextLine();接收字符串
        //可以接收空格,制表符,遇到回车停止接收

        //先用第一套体系
        //俩套体系不能混用
        //如果先用nextInt再用nextLine,会导致nextLine接收不到数据

        /*Scanner sc = new Scanner(System.in);
        System.out.println("请录入第一个整数");//123 123
        int num1 = sc.nextInt();//123,只接受第一个
        System.out.println(num1);
        System.out.println("请录入第二个整数");//这时不需要再次输入整数,自动接收第二个123
        int num2 = sc.nextInt();
        System.out.println(num2);

         */
        /*Scanner s = new Scanner(System.in);
        System.out.println("请录入一个字符串");//abd def
        String str1 = s.next();//abd
        System.out.println(str1);
        System.out.println("请录入第二个字符串");
        String str2 = s.next();//def
        System.out.println(str2);

         */

        Scanner sc = new Scanner(System.in);
        System.out.println("请录入第一个字符串");
        String str1 = sc.nextLine();//asw def
        System.out.println(str1);//asw def
        System.out.println("请录入第二个字符串");
        String str2 = sc.nextLine();//123 345
        System.out.println(str2);//123 345

    }
}

package com.itheima.arithmeticoperator;

public class arithmeticoperatorDemo2 {
    //字符串的"+"是字符串连接符,表拼接
    public static void main(String[] args) {
        System.out.println(3.7+"abc");
        System.out.println("abc"+true);
        System.out.println('z'+"abc"+true);
        System.out.println(1 + 2 + "abc" + 4 + 5);
        int age = 18;
        System.out.println("my age is" + "age" + "years old");
        int a = 18;
        System.out.println("my age is" + a + "years old");
        //字符+
        //当字符加字符,字符加数字时,会把字符通过ASCII码表查询到对应的数字进行计算
        //'a'=97
        System.out.println(1 + 'a');//98
        System.out.println('a' + "abc");//"aabc"


    }
}

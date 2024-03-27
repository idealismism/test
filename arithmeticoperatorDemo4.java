package com.itheima.arithmeticoperator;

import java.security.KeyStore;

public class arithmeticoperatorDemo4 {
    public static void main(String[] args) {
        //1.判断左右两边是否相等
        int a = 10;
        int b = 10;
        int c = 20;
        System.out.println(a == b);
        System.out.println(b == c);
        //^y异或
        //相同为false,不同为true
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ false);
        System.out.println(false ^ true);

        // !逻辑非,取反
        System.out.println(!false);
        System.out.println(!true);
    }
}

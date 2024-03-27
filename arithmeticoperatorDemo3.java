package com.itheima.arithmeticoperator;

public class arithmeticoperatorDemo3 {
    public static void main(String[] args) {
        //++和--
        int a = 10;
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);
        a--;
        System.out.println(a);
        --a;
        System.out.println(a);
        //规则,将左边和右边进行相加,再赋值给左边
        int b = 10;
        int c = 20;
        b += c;//等同于 b = (int) (b+c);
        System.out.println(b);
        System.out.println(c);

        //+=,-=,*=,/=,%=底层都隐藏了一个强制型转换
        short s = 1;
        s += 1;//等同于s = (short)(s+1);
        System.out.println(s);

    }
}

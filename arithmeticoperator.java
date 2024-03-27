package com.itheima.arithmeticoperator;

public class arithmeticoperator {
    public static  void main(String[] args){
        System.out.println(3+2);
        System.out.println(10-4);
        System.out.println(4*5);
        //如果在计算中有小数参与,结果有可能不精确
        System.out.println(1.1+1.01);
        System.out.println(1.1*2);
        //除法
        //1.整数参与计算,结果只能是整数
        //2.小数参与计算,结果可能不精确
        System.out.println(10/5);
        System.out.println(10.0/3);

        //取模,取余,实际上也是除法运算,只不过求的是余数
        System.out.println(10%5);
        System.out.println(9%5);
        //应用场景:
        //1.可以用取模来判断,A是否可以被B整除,A%B
        //2.可以判断A是否为偶数,A%2
        //3.斗地主发牌

    }
}

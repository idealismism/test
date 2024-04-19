package com.itheima.suanshuDemo;

public class SuanShuDemo {
    public static void main(String[] args) {
        boolean flag = true;
        boolean flag1 = true;
        System.out.println(flag == flag1);
        String str = "hello";
        String str1 = new String("hello");
        System.out.println(str1);
        System.out.println(str == str1);//false
        //两个等等号,只能判断基本数据类型是否相等,不能用于判断引用数据类型是否相等
        //比较的是两个引用数据在内存中地址是否相等
        char c = 'c';
        int i = 10;
        double d = 10;
        long l = 1;
        String s = "hello";
        int a = 2;
        s += i;//隐藏了一个强制类型转化,hello10
        System.out.println(s);
        // i+=s;错误
        //c+=s;错误

        //a++,先用后加
        //++a,先加后用
        int m = 5, n = 6;
        int x = (m++) + n;//5+6  ,m=6,n=6
        int y = (--m) + n;//5+6, m=5,n=6
        System.out.println(m);
        System.out.println(n);
        System.out.print("x=" + x + ",");
        System.out.println("y=" + y);


    }

    public class MathDemo {
        public static void main(String[] args) {
            //将变量m的初值赋值为10，变量n的初值赋值为5
            int m = 10, n = 5;

            //变量m的值加3，n的值加5
            m += 3;
            n += 5;

            //求m和n的平均值，并将结果存于变量p中
            double p;
            p = (m + n) / 2.0;

            //求m的平方乘以n的平方，并将结果存于变量q中
            int q;
            q = (m * m) * (n * n);

            //将p和q的值打印输出
            System.out.println(p);  // 输出的值为11.5
            System.out.println(q);  // 输出的值为16900
        }
    }
    public class SuanShu1Demo {
        public static void main(String[] args) {
            //声明三个整型变量a、b、c
            int a , b , c;

            //分别为a,b,c赋值为4,15,20
            a = 4; b = 15; c = 20;

            //计算(b/a)+c的值 ，并赋值给变量m
            double m;
            m = ((double)b / a ) + c;

            //计算(c%b)*a-c的值，并赋值给变量n
            int n;
            n = ( c % b ) * a - c;

            //输出m和n的值
            System.out.println(m);  // 输出的值为23.75
            System.out.println(n);  // 输出的值为0

        }
    }
}

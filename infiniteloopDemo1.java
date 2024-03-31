package com.itheima.InfiniteloopDemo;

public class infiniteloopDemo1 {
    public static void main(String[] args) {
        /*for循环的无限循环
        for (;;){
        System.out.println("go");
        }

         */
        //注意:无限循环的下面不能再写其他代码了,因为循环永远停不下来,下面的代码永远执行不到
        //while循环的无限循环
        while (true) {
            System.out.println("go");
        }

    }
}

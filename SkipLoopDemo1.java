package com.itheima.skiploopDemo;

public class SkipLoopDemo1 {
    public static void main(String[] args) {
        /*跳转控制语句
        需求:小老虎吃包子,连续吃了五个
        第三个包子有虫,跳过不吃
         */
        for (int i = 1; i <= 5 ; i++) {
            if (i == 3){
                continue;  //结束本次循环,继续下次循环
            }
            System.out.println("小老虎在吃第"+i+"个包子");
        }
        /*
        小老虎吃包子,吃到第三个包子就饱了
         */
        for (int i = 1; i <=5 ; i++) {
            System.out.println("小老虎在吃第"+i+"个包子");
            if(i == 3){
                break;
            }
        }
    }
}

package com.itheima_JavaBean_05_10.test;

public class GameTest {
    public static void main(String[] args) {
        //定义变量
        Role r1 = new Role("乔峰",100);
        Role r2 = new Role("鸠摩智",100);
        //开始格斗
        //不确定要格斗几次,所以用while(true)一直循环
        while (true){
            r1.attack(r2);
            if(r2.getBlood() == 0){
                System.out.println(r1.getName()+"ko"+r2.getName());
                break;
            }
            r2.attack(r1);
            if(r1.getBlood() == 0){
                System.out.println(r2.getName()+"ko"+r1.getName());
                break;
            }
        }
    }
}

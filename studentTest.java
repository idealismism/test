package com.itheima.test1;



public class studentTest {
    public static void main(String[] args) {
        student s = new student();
        student ss = new student("zhangsan",23);
        System.out.println(ss.getAge());
        System.out.println(ss.getName());
    }
}

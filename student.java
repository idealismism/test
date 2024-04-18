package com.itheima.test1;

import javax.naming.Name;

public class student {
    private String name;
    private int age;
    public  student(){
        System.out.println("kong");
    }
    public  student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public  int getAge(){
        return age;
    }
}
